package PA11;
// the abstract class Shape goes in this file

public abstract class Shape implements IShape {
	
	public ShapeType type;
	public String name;
	
	public Shape(ShapeType type, String name) {
		this.type = type;
		this.name = name;
	}
	
	@Override
	public ShapeType type() {
		return type;
	}

	@Override
	public String name() {
		return name;
	}

	public String toString() {
		return String.format("%-9s: Area = %.4f, Volume = %.4f", name, area(), volume());
	}

}



