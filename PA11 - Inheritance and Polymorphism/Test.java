package PA11;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Test {
	
	static final String FILE_PATH = "src/PA11/shapes.txt"; // you may need to change this

	static void print(ArrayList<IShape> shapes) {
		for (IShape shape : shapes)
			System.out.println(shape);
	}

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<IShape> shapes = ShapeReader.readShapes(FILE_PATH);
		System.out.println("*** Original Order ***\n");
		print(shapes);
		System.out.println("\n*** Sorted By Area ***\n");
		ShapeSorter.sortByArea(shapes);
		print(shapes);
		System.out.println("\n*** Grouped By Type and Sorted By Volume ***\n");
		ShapeSorter.sortByTypeAndVolume(shapes);
		print(shapes);
	}

}
