/*
 * Find the number of even and odd numbers in an array
-Count how many even and odd numbers are in an array.
 */
import java.util.*;
public class Count_Even_And_Odd_Numbers_In_Arry {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] a = new int[size];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        
        int count1=0,count=0;
        
        for(int i=0;i<a.length;i++) {
        	if(a[i]%2==0) {
        		count++;
        	}
        	else {
        		count1++;
        	}
        }
        System.out.println("Even Numbers in Array : "+count);
        System.out.println("Odd Numbers in Array : "+count1);
	}

}
