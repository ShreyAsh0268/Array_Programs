import java.util.*;
public class Find_Pair_Of_Sum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of Arrasy");
		int size=s.nextInt();
		System.out.println("Enter Elements in Array");
		int a[]=new int [size];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter Sum to Find Pair : ");
		int sum=s.nextInt();
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(sum==a[i]+a[j]) {
					System.out.println(a[i]+"+"+a[j]+" :"+sum);
				}
			}
		}

	}

}
