/*
 * Find the intersection of two arrays
Given two arrays, find their intersection (common elements).
 */

import java.util.Scanner;

public class Find_Common_Elements_In_Array {

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
        
        System.out.println("Common Elements In Arrays : ");
        int flag=0;
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<b.length;j++) {
        		if(a[i]==b[j]) {
        			flag=1;
        			break;
        		}
        	}
        	if(flag==1) {
        		System.out.println(a[i]);
        		flag=0;
        	}
        }
	}

}
