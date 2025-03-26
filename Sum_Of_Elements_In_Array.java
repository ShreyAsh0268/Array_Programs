/*
 * Sum of elements in an array
-Calculate the sum of all elements in the array.
 */
import java.util.*;

public class Sum_Of_Elements_In_Array {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size=s.nextInt();
		System.out.println("Enter Elements In Array");
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}

		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum Of All Elements In Array : "+sum);
	}

}
