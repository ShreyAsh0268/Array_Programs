/*
 * 5) Left Rotate an Array by a Given Number of Positions

Implement a Java program that rotates an array to the left by a specified number of positions.
 */

import java.util.Scanner;

public class Roteat_Array {

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
        
        System.out.print("Enter the index of the array for rotation: ");
        int index = scanner.nextInt();
        index = index % size; // Handle cases where positions > size
        
        int[] rotatedArr = new int[size];
        for (int i = 0; i < size; i++) {
            rotatedArr[i] = a[(i + index) % size];
        }
        for(int i=0;i<size;i++)
        {
        	System.out.print(rotatedArr[i]+" ");
        }
	}

}
