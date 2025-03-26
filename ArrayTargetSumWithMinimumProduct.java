import java.util.Scanner;

public class ArrayTargetSumWithMinimumProduct {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Array");
		int a[]= {3, 8, 12, 4, 7, 6, 2, 5, 11, 9, 10};
		
		System.out.println("Enter Target Sum");
		int t=0,t1=0;
		int sum=13;
		int privproduct=0;
		int product=10000;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(sum==a[i]+a[j]) {
					privproduct=a[i]*a[j];
					if(privproduct<product) {
						product=privproduct;
						t=a[i];
						t1=a[j];
					}
				}
				
			}
		}
		System.out.println(product+" ("+t+","+t1+")");

	}

}
