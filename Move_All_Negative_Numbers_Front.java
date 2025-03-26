import java.util.*;
public class Move_All_Negative_Numbers_Front {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of Arrasy");
		int size=s.nextInt();
		System.out.println("Enter Elements in Array");
		int a[]=new int [size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		int zi=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=0)
			{
				int temp=a[zi];
				a[zi]=a[i];
				a[i]=temp;
				zi++;
			}
		}System.out.println();
		System.out.println("Zero on start");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}

	}

}
