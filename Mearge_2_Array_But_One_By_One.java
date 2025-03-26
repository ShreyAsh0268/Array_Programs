import java.util.Scanner;

public class Mearge_2_Array_But_One_By_One {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter First Array");
		int a[]= {5,2,7,3,9};
		System.out.println("Enter Second Array");
		int a1[]= {55,45,35,25,15};
		int a2[]=new int[a1.length];
		int a3[]=new int[a.length+a1.length];
		
		for (int i = 0; i < a1.length; i++) {
            a2[i] = a1[a1.length - 1 - i];
        }
		boolean flag = false;
		int j=0;
		for(int i=0;i<a3.length;i++) {
			if(!flag) {
				a3[i]=a[i-j];
				flag=true;
				j++;
			}
			else {
				a3[i]=a2[i-j];
				flag = false;
			}
		}
		
		for(int i=0;i<a3.length;i++) {
			System.out.print(a3[i]+" ");
		}

	}

}
