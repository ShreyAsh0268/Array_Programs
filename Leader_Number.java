/*
 * 7) Find Leaders in an Array

A "leader" in an array is an element greater than all elements to its right. Write a Java program to find and print all leaders in a given array.

 */
import java.util.Scanner;

public class Leader_Number {

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
        System.out.println("Leader elements of array:");
        int flag=0;
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]>a[j])
        		{
        			flag=1;
        		}
        	}
        	if(flag==1)
        	{
        		System.out.println(a[i]+" ");
        		flag=0;
        	}
        }
	}

}
