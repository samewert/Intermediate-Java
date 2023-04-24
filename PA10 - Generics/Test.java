package PA10;

import java.util.Arrays;

public class Test {

	private static void testBinarySearch() {
		String[] fwd = { "aaa", "aaa", "aac", "abc", "abc", "abc", "abcdx", "abcx", "abcxy", "wxcdx", "wxcdx", "xyzab",
				"xyzw", "xyzw" };
		String[] bwd = new String[fwd.length];
		for (int i = 0, j = fwd.length - 1; i < fwd.length; i++, j--)
			bwd[j] = fwd[i];
		String[] keys = { "aaa", "a", "abc", "zyz", "abcxy", "xyzz", "xyzw", "wxcdx", "aac" };
		System.out.printf("*** Searching Sorted Array ***%n", Arrays.toString(fwd));
		System.out.printf("\nArray: %s\n\n", Arrays.toString(fwd));
		for (String key : keys)
			System.out.printf("Index of %s is %d%n", key, BinarySearch.binarySearch(fwd, key));

		System.out.printf("\n*** Searching Reverse-Sorted Array ***%n", Arrays.toString(bwd));
		System.out.printf("\nArray: %s\n\n", Arrays.toString(bwd));
		for (String key : keys)
			System.out.printf("Index of %s is %d%n", key, BinarySearch.binarySearch(bwd, key));
	}

	private static void testShape() {

		System.out.println("\n***\n");
		String rect_1 = "Rectangle_1";
		Shape shape = new Rectangle(5, 12, rect_1);
		ShapePrinter.print(shape);
		System.out.println("\n***\n");

		String square_1 = "Square_1";
		shape = new Square(5, square_1);
		ShapePrinter.print(shape);
		System.out.println("\n***\n");

		String triangle_1 = "Triangle_1";
		shape = new Triangle(5, 6, 16, triangle_1);
		ShapePrinter.print(shape);
		System.out.println("\n***\n");

		String triangle_2 = "Triangle_2";
		shape = new Triangle(6, 16, 5, triangle_2);
		ShapePrinter.print(shape);
		System.out.println("\n***\n");

		String triangle_3 = "Triangle_3";
		shape = new Triangle(16, 5, 6, triangle_3);
		ShapePrinter.print(shape);
		System.out.println("\n***\n");

		String triangle_4 = "Triangle_4";
		shape = new Triangle(5, 5, 5, triangle_4);
		ShapePrinter.print(shape);
		System.out.println("\n***\n");

		String triangle_5 = "Triangle_5";
		shape = new Triangle(3, 5, 4, triangle_5);
		ShapePrinter.print(shape);
		System.out.println("\n***\n");

		String triangle_6 = "Triangle_6";
		shape = new Triangle(4, 6, 4, triangle_6);
		ShapePrinter.print(shape);
	}

	public static void main(String[] args) {
		testBinarySearch();
		testShape();
	}

}
