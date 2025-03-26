
/*
 * Find the second largest element in an array
-Find the second largest element in an unsorted array.
 */
import java.util.*;

public class Find_Second_Largest_Element_In_Array {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size = s.nextInt();

		if (size >= 2) {
			System.out.println("Enter Elements In Array");
			int a[] = new int[size];
			for (int i = 0; i < a.length; i++) {
				a[i] = s.nextInt();
			}

			int largest = Integer.MIN_VALUE;
			int secLargest = Integer.MIN_VALUE;

			for (int i = 0; i < a.length; i++) {
				if (a[i] > largest) {
					secLargest = largest;
					largest = a[i];
				} else if (a[i] > secLargest && a[i] != largest) {
					secLargest = a[i];
				}
			}
			if (secLargest == Integer.MIN_VALUE) {
				System.out.println("Element Not Found");
			} else {
				System.out.println(secLargest);
			}
		} else {
			System.out.println("Enter Array Size Atleast  2");
		}
	}

}
