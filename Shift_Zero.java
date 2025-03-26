/*
 * 1) Add Zero to Start of Array

Write a Java program to take an array of integers as input and move all zeros to the start while maintaining the order of other elements.
Add Zero to End of Array

Implement a Java program that moves all zeros in an array to the end while keeping the order of non-zero elements unchanged.
 */

import java.util.Scanner;

public class Shift_Zero {

	public static void main(String[] args) {
		/*int a[]= {5,0,1,0,4};
		int nzi=0;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]!=0)
			{
				int temp=a[nzi];
				a[nzi]=a[i];
				a[i]=temp;
				nzi++;
			}
		}
		System.out.println("Zero on End");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		int b[]= {5,0,1,0,4};
		int zi=0;
		for(int i=0;i<b.length;i++)
		{
			if(b[i]==0)
			{
				int temp=b[zi];
				b[zi]=b[i];
				b[i]=temp;
				zi++;
			}
		}System.out.println();
		System.out.println("Zero on start");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+",");
		}*/
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=xyz.nextInt();
		System.out.println("Enter the Array");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
		   arr[i]=xyz.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
		   if(arr[i]==0)
			{
				int temp=arr[i];
				for(int j=i;j>0;j--)
		  		 {
					arr[j]=arr[j-1];
			  	} 
				arr[0]=temp;
			}
	           
		}

		for(int i=0;i<arr.length;i++)
		{
		   	System.out.println(arr[i]);

		}
	}

}
