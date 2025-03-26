/*
 * Check if an array contains duplicate elements
-Check if the given array contains any duplicate values.
 */

import java.util.*;

public class Find_Duplicate_Elements_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] a = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        
        int count,flag=0;
        for(int i=0;i<a.length;i++) {
       		count=1;
       		for(int j=i+1;j<a.length;j++) {
       			if(a[i]==a[j]) {
           			count++;
           		}
       		}
       		if(count>1) {
        		flag=1;
        		break;
        	}
        }
        if(flag==1) {
        	System.out.println("Array Contain Duplicate Values");
        	flag=0;
        }
        else {
        	System.out.println("Array Dose Not Contain Duplicate Values");
        }
	}

}
