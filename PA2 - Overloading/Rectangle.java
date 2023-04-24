package PA2;

public class Rectangle{
	
	private final double length, width;
	private final char name;
	private static int numOfInstances;
	
	public Rectangle(final int length, final int width, final char name) {
		this.length = length;
		this.width = width;
		this.name = name;
		numOfInstances++;
	}
	
	public final double area() {
		return this.width * this.length;
	}
	
	public final double perimeter() {
		return 2 * (this.length + this.width);
	}
	
	public final int compareArea(final Rectangle rectArg) {
		if(this.area() > rectArg.area()) {
			return 1;
		}
		if(this.area() < rectArg.area()) {
			return -1;
		}
		return 0;
	}
	
	public final int comparePerimeter(final Rectangle rectArg) {
		if(this.perimeter() > rectArg.perimeter()) {
			return 1;
		}
		if(this.perimeter() < rectArg.perimeter()) {
			return -1;
		}
		return 0;
	}
	
	public static final int numberOfRectangles() {
		return numOfInstances;
	}
	
	public final String toString() {
		return "(" + name + ", " + length + ", " + width + ")";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}