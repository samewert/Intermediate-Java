package PA11;

public class Sphere extends Shape {

	private double radius;
	
	public Sphere(String name, double radius) {
		super(ShapeType.SPHERE, name);
		this.radius = radius;
	}
	
	@Override
	public double area() {
//		area: 4 × (pi × radius^2)
		double insideBrackets = Math.PI * Math.pow(radius, 2);
		return 4.0 * insideBrackets;
	}

	@Override
	public double volume() {
//		volume: 4/3 × (pi × radius^3)
		double insideBrackets = Math.PI * Math.pow(radius, 3);
		return (4.0/3.0) * insideBrackets;
	}
	
}