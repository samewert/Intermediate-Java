package PA10;

public class ShapePrinter {
	
	public static void print(Shape shape) {
		System.out.println("Details for " + shape.getName());
		try {
			System.out.println("Perimeter is " + shape.perimeter());
			System.out.println("Area is " + shape.area());
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}