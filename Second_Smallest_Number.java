/*
 * 10) Find the Second Smallest Missing Number in an Array

Given a sorted array of unique numbers, write a Java program to find the second smallest missing number.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Second_Smallest_Number {

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
        Arrays.sort(a);
        System.out.println("Second Smallest Element in Array :");
        for(int i=0;i<1;i++)
		{
			for(int j=a[i]+1;j<=a[i]+1;j++)
			{
				System.out.println(j);
			}
		}
        
	}

}
