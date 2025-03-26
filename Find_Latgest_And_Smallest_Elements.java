/*
 * Find the largest and smallest element in an array
-Write a program to find the maximum and minimum value in an unsorted array.

 */
import java.util.*;
public class Find_Latgest_And_Smallest_Elements {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size=s.nextInt();
		System.out.println("Enter Elements In Array");
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		int largest=a[0];
		int smallest=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(largest<a[i]) {
				largest=a[i];
			}
			if(smallest>a[i]) {
				smallest=a[i];
			}
		}
		System.out.println("Largest Element In Array : "+largest);
		System.out.println("Smallest Element In Array : "+smallest);
	}

}
