/*
 * 6) Find the Majority Element in an Array After Sorting

Write a Java program that sorts an array and determines if there is a majority element (an element that appears more than n/2 times).

 */
import java.util.Scanner;

public class Find_Mejority_Element_After_Sorting {

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
		int sum=0;
		int mejo=0;
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
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>sum)
			{
				sum=count;
				mejo=a[i];
			}
		}
		if(sum>=a.length/2)
		{
			System.out.println("Mejority element in array: "+mejo);
		}
		else
		{
			System.out.println("Mejority element is greter than lenght of array half is not found ");
		}
	}

}
