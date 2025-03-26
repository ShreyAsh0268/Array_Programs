/*
 * Merge two sorted arrays
Merge two sorted arrays into a single sorted array.
 */

import java.util.*;
public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of first array: ");
        int size = scanner.nextInt();
        
        int[] a = new int[size];
        System.out.println("Enter the elements of First array:");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the size of second array: ");
        int size1 = scanner.nextInt();
        
        int[] b = new int[size];
        System.out.println("Enter the elements of Second array:");
        for (int i = 0; i < size1; i++) {
            b[i] = scanner.nextInt();
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
        int c[]=new int[(a.length)+(b.length)];
        int index=0;
        
        for(int i=0;i<a.length;i++) {
        	c[index++]=a[i];
        }
        for(int i=0;i<b.length;i++) {
        	c[index++]=b[i];
        }
        Arrays.sort(c);;
        System.out.println("Combined Array");
        for(int i=0;i<c.length;i++) {
        	System.out.println(c[i]);
        }

	}

}
