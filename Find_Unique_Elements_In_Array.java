/*
 * Find the union of two arrays
Given two arrays, find their union (all unique elements).
 */

import java.util.*;

public class Find_Unique_Elements_In_Array {

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
        
        System.out.println("Unique Elements In Arrays : ");
        int temp=0;
        int flag=0;
        for(int i=0;i<a.length;i++) {
        	for(int j=0;j<b.length;j++) {
        		if(a[i]==b[j]) {
        			flag=1;
        			break;
        		}
        		else {
        			flag=0;
        			temp=b[j];
        		}
        	}
        	if(flag==0) {
        		System.out.println(a[i]+"   "+temp);
        		flag=0;
        	}
        }
        
        

	}

}
