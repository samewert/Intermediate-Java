package PA10;

public abstract class Shape{
	
	protected String name;
	
	protected Shape(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	protected abstract double area() throws InvalidTriangleException;
	protected abstract double perimeter() throws InvalidTriangleException;
		
}