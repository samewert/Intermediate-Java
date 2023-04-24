package PA2;

import java.util.Arrays;

public class Test{
	
	public static void main(String[] args) {
		
		Rectangle A = new Rectangle(15, 10, 'A');
		Rectangle B = new Rectangle(5, 100, 'B');
		Rectangle C = new Rectangle(30, 5, 'C');
		Rectangle D = new Rectangle(20, 5, 'D');
		Rectangle E = new Rectangle(10, 5, 'E');
		
		System.out.println("Number of rectangles created is " + Rectangle.numberOfRectangles());
		
		System.out.println("***************************************");
		
		System.out.println("Rectangle " + A.toString() + " created");
		System.out.println("Rectangle " + B.toString() + " created");
		System.out.println("Rectangle " + C.toString() + " created");
		System.out.println("Rectangle " + D.toString() + " created");
		System.out.println("Rectangle " + E.toString() + " created");
		
		System.out.println("***************************************");
		
		System.out.println("Area of A is " + A.area());
		System.out.println("Perimeter of B is " + B.perimeter());
		
		System.out.println("***************************************");
		
		System.out.println("Area of A " + (A.compareArea(B) == 1 ? "is more than" : A.compareArea(B) == -1 ? "is less than" : "equals") + " B"); 
		System.out.println("Area of A " + (A.compareArea(C) == 1 ? "is more than" : A.compareArea(C) == -1 ? "is less than" : "equals") + " C");
		System.out.println("Area of A " + (A.compareArea(D) == 1 ? "is more than" : A.compareArea(D) == -1 ? "is less than" : "equals") + " D");
		
		System.out.println("***************************************");
		
		System.out.println("Perimeter of A " + (A.comparePerimeter(B) == 1 ? "is more than" : A.comparePerimeter(B) == -1 ? "is less than" : "equals") + " B");
		System.out.println("Perimeter of A " + (A.comparePerimeter(D) == 1 ? "is more than" : A.comparePerimeter(E) == -1 ? "is less than" : "equals") + " D");
		System.out.println("Perimeter of A " + (A.comparePerimeter(E) == 1 ? "is more than" : A.comparePerimeter(E) == -1 ? "is less than" : "equals") + " E");
		
		System.out.println("***************************************");
		
		int[] a = new int[] {-13, 47, -13, 21, 51, -13, 77, -13, 1, -13};
		MaxAndCount obj = new MaxAndCount(a);
		System.out.println("Array is " + Arrays.toString(a));
		
		System.out.println();
		
		System.out.println("Maximum in array is " + obj.findMax());
		System.out.println("Maximum in array[-1,5] is " + obj.findMax(-1,5));
		System.out.println("Maximum in array[1,10] is " + obj.findMax(1,10));
		System.out.println("Maximum in array[6,5] is " + obj.findMax(6,5));
		System.out.println("Maximum in array[1,5] is " + obj.findMax(1,5));
		System.out.println("Maximum in array[2,2] is " + obj.findMax(2,2));
		
		System.out.println();
		
		System.out.println("Number of occurrences of 14 in array is " + obj.countKey(14));
		System.out.println("Number of occurrences of 1 in array is " + obj.countKey(1));
		System.out.println("Number of occurrences of -13 in array is " + obj.countKey(-13));
		System.out.println("Number of occurrences of -13 in array[-1,5] is " + obj.countKey(-1,5,-13));
		System.out.println("Number of occurrences of -13 in array is[1,10] " + obj.countKey(1,10,-13));
		System.out.println("Number of occurrences of -13 in array is[6,5] " + obj.countKey(6,5,-13));
		System.out.println("Number of occurrences of -13 in array is[1,5] " + obj.countKey(1,5,-13));
		System.out.println("Number of occurrences of -13 in array is[2,2] " + obj.countKey(2,2,-13));



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
