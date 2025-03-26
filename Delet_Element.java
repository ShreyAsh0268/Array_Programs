/*
 * 3) Delete a Specific Element from an Array

Create a Java program that allows the user to input an array and a specific value, then deletes all occurrences of that value while maintaining the order of other elements.

 */
public class Delet_Element {
	public static void main(String x[]) {
		int a[]={1,5,4,3,4};
		int value=4;
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==value)
			{
				count++;
			}
		}
		int b[]=new int [a.length-count];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=value)
			{
				b[index++]=a[i];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+",");
		}
	}
}
