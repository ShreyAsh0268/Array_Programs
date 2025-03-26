/*
 * 2) Find Majority Element in an Array

Write a Java program that checks if a given number appears more than n/2 times in an array, where n is the array size.

 */
public class Find_Mejority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,0,1,2,4,2,4,2,5,2};
		int sum=0;
		int mejo=0;
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
