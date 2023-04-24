package PA11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShapeReader {

	// add the file reader method here
	public static ArrayList<IShape> readShapes(String filePath) throws FileNotFoundException {
		ArrayList<IShape> shapes = new ArrayList<IShape>();
		Scanner scan = new Scanner(new FileInputStream(filePath));
		while(scan.hasNext()) {
			String name = scan.next();
			char shape = name.charAt(1);
			switch(shape) {
			case 'U': //Cuboid
				double cuboidLength = scan.nextDouble();
				double cuboidWidth = scan.nextDouble();
				double cuboidHeight = scan.nextDouble();
				shapes.add(new Cuboid(name, cuboidLength, cuboidWidth, cuboidHeight));
//				shapes.add(new Cuboid(name, scan.nextDouble(), scan.nextDouble(), scan.nextDouble()));
				break;
			case 'Y': //Cylinder
				double cylinderRadius = scan.nextDouble();
				double cylinderHeight = scan.nextDouble();
				shapes.add(new Cylinder(name, cylinderRadius, cylinderHeight));
//				shapes.add(new Cylinder(name, scan.nextDouble(), scan.nextDouble()));
				break;
			case 'P': //Sphere
				double sphereRadius = scan.nextDouble();
				shapes.add(new Sphere(name, sphereRadius));
//				shapes.add(new Sphere(name, scan.nextDouble));
				break;
			default:
				break;
			}
		}
		scan.close();
		return shapes;
	}
	
}
