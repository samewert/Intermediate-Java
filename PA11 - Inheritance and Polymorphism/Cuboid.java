package PA11;

public class Cuboid extends Shape {
	
	private double length, width, height;
	
	public Cuboid(String name, double length, double width, double height) {
		super(ShapeType.CUBOID, name);
		this.length = length;
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
//		area: 2 × (length × width + width × height + length × height)
		double insideBrackets = (length * width) + (width * height) + (length * height);
		return 2.0 * insideBrackets;
	}

	@Override
	public double volume() {
//		volume: length × width × height
		return length * width * height;		
	}	
	
}