package PA11;

public class Cylinder extends Shape {

	private double radius, height;
	
	public Cylinder(String name, double radius, double height) {
		super(ShapeType.CYLINDER, name);
		this.radius = radius;
		this.height = height;
	}
	
	@Override
	public double area() {
//		area: 2 × pi × radius × height + 2 × pi × radius^2
		double firstPart = 2.0 * Math.PI * radius * height;
		double secondPart = 2.0 * Math.PI * Math.pow(radius, 2);
		return firstPart + secondPart;
	}

	@Override
	public double volume() {
//		volume: pi × (radius2 × height)
		double insideBrackets = Math.pow(radius, 2) * height;
		return Math.PI * insideBrackets;		
	}
	
}