/*
 * 8) Find the Missing Elements in a Sorted Array

Implement a Java program that identifies missing numbers in a sorted sequence of integers.

 */
import java.util.Scanner;

public class Missing_Element {

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
        
        for(int i=0;i<a.length;i++)
        {
        	for(int j=i+1;j<a.length;j++)
        	{
        		if(a[i]>a[j])
        		{
        			int temp=a[i];
        			a[i]=a[j];
        			a[j]=temp;
        		}
        	}
        	
        }
        
        for(int i=0;i<a.length-1;i++)
		{
			for(int j=a[i]+1;j<a[i+1];j++)
			{
				System.out.println(j);
			}
		}
	}

}
