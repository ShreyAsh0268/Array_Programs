/*
 * 11) Insert a Value at a Specified Index in an Array

Implement a Java program that allows the user to insert a specified value at a given index in an array while shifting elements accordingly.

 */

import java.util.Scanner;

public class Insert_Value_On_Specific_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] a = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size-1; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Enter index for insert");
        int index=scanner.nextInt();
        System.out.println("Enter value for insert");
        int val=scanner.nextInt();
        index=index-1;
        int b[]=new int [size];
        for(int i=0;i<b.length;i++)
        {
        	if(i!=index)
        	{
        		b[i]=a[i];
        	}
        	else
        	{
        		b[i]=val;
        	}
        	System.out.print(b[i]+" ");
        }
        /*for(int i=0;i<b.length;i++)
        {
        	System.out.print(b[i]+" ");
        }*/
	}

}
