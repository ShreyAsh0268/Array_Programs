/*
 * Find the index of the first occurrence of a given element
-Find the index of the first occurrence of an element in an array.

 */

import java.util.*;

public class Find_First_Occurence_Of_Element_In_Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] a = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        int temp=0,flag=0;
        for(int i=0;i<a.length;i++) {
         
        		for(int j=i+1;j<a.length;j++) {
        			if(a[i]==a[j]) {
            			flag=1;
        				temp=j;
            			break;
            		}
        		}
        	
        	if(flag==1) {
        		System.out.println(a[i]+" Index Of First Occurence : "+temp);
        		flag=0;
        	}
        	
        }

	}

}
