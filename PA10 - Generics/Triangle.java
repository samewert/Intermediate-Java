package PA10;

public class Triangle extends Shape{
	
	protected double a, b, c;
	
	public Triangle(double a, double b, double c, String name) {
		super(name);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public boolean isValid() throws InvalidTriangleException {
		if(a + b > c && a + c > b && b + c > a) {
			return true;
		}
		throw new InvalidTriangleException("Sum of two sides must be > the third :-(");
	}
	
	public double perimeter() throws InvalidTriangleException {
		if(isValid()) {
			double perimeter = a + b + c;
			return perimeter;
		}
		return -1;
	}
	
	public double area() throws InvalidTriangleException {
		if(isValid()) {
			double s = (a + b + c) / 2;
			double formulaInside = s * (s - a) * (s - b) * (s - c);
			return Math.sqrt(formulaInside);
		}
		return -1;
	}
	
}