/*
 * Reverse an array
-Reverse the elements of an array in place.
 */
import java.util.*;
public class Reverse_Array {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size Of Array");
		int size=s.nextInt();
		System.out.println("Enter Elements In Array");
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		int left=0,right=a.length-1;
		while(left<right) {
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
