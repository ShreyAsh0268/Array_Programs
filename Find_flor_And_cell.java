/*
 * 4) Find Floor and Ceil of a Given Number in a Sorted Array

Write a Java program to find the floor and ceil of a given number in a sorted array using binary search.

 */
import java.util.Scanner;

public class Find_flor_And_cell {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the sorted array: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the number to find floor and ceil: ");
        int key = scanner.nextInt();
        
        int floor = -1, ceil = -1;
        
        for (int i = 0; i < size; i++) {
            if (arr[i] <= key) {
                floor = arr[i];
            }
            if (arr[i] >= key && ceil == -1) {
                ceil = arr[i];
            }
        }
        
        System.out.println("Floor of " + key + " is: " + (floor == -1 ? "None" : floor));
        System.out.println("Ceil of " + key + " is: " + (ceil == -1 ? "None" : ceil));
	}

}
