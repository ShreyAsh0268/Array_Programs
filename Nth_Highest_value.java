/*
 * 9) Find the Nth Highest Value in an Array

Write a Java program that allows the user to enter an array and an integer n, then finds the nth highest value in the array.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Nth_Highest_value {

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
        System.out.println("Enter n Value");
        int n=scanner.nextInt();
        
        if(n>=size && n<=0)
        {
        	
        }
        else
        {
        	Arrays.sort(a);
        	System.out.println("highest Number of "+n+" :"+a[size-n]);
        }
	}

}
