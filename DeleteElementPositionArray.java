import java.util.Scanner;

public class DeleteElementPositionArray {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Array Elements");
		int a[]= {1,2,3,4,5};
		
		System.out.println("Enter index for delet element");
		int ind = s.nextInt();
		
		for(int i=ind;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		
		for(int i=0;i<a.length-1;i++) {
			System.out.println(a[i]);
		}
	}

}
