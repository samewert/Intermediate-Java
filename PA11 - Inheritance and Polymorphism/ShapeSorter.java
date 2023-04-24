package PA11;

import java.util.ArrayList;
import java.util.Comparator;

public class ShapeSorter {

	private static int compare(double d1, double d2) { // You may find this method useful, although not mandatory
		if (d1 > d2)
			return 1;
		if (d1 < d2)
			return -1;
		return 0;
	}

	// add the three methods here
	public static void insertionSort(ArrayList<IShape> shapes, Comparator<IShape> comparator) {  
		int n = shapes.size();
		for(int i= 1; i < n; i++) {
			IShape temp = shapes.get(i);
			int j = i;
			while(j > 0 && comparator.compare(temp, shapes.get(j - 1)) < 0) {
				shapes.set(j, shapes.get(j - 1));
				j = j - 1;
			}
			shapes.set(j, temp);
		}
	}
	
	public static void sortByArea(ArrayList<IShape> shapes) {
		Comparator<IShape> comparator = new Comparator<IShape>() {
			@Override
			public int compare(IShape arg1, IShape arg2) {
				return ShapeSorter.compare(arg1.area(), arg2.area());
			}
		};
		insertionSort(shapes, comparator);	
	}
	
	public static void sortByTypeAndVolume(ArrayList<IShape> shapes) {
		Comparator<IShape> comparator = new Comparator<IShape>() {
			@Override
			public int compare(IShape arg1, IShape arg2) {
				if(arg1.type() == arg2.type()) {
					return ShapeSorter.compare(arg1.volume(), arg2.volume());
				}
				return arg1.type().toString().compareTo(arg2.type().toString());
			}
		};
		insertionSort(shapes, comparator);	
	}
	
}