package PA10;

public class Rectangle extends Shape {
	
	protected double length, width;
	
	public Rectangle(double length, double width, String name) {
		super(name);
		this.length = length;
		this.width = width;
	}
	
	public double perimeter() {
		double perimeter = 2 * (length + width);
		return perimeter;
	}
	
	public double area() {
		double area = length * width;
		return area;
	}
	
}