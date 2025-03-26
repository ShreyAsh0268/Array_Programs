/*
 * Check if an array is sorted
-Determine if the given array is sorted in ascending or descending order.
 */
import java.util.*;

public class Check_Array_Is_Sorted_Or_Not {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size=s.nextInt();
		System.out.println("Enter Elements In Array");
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		int flag=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				flag=1;
				break;
			}
		}
		int flag1=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				flag1=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println("Array Is Sorted In Asending Order");
		}
		else if(flag1==0)
		{
			System.out.println("Array Is Sorted In Disending Order");

		}
		else {
			System.out.println("Array Is Un Sorted");
		}
	}

}
