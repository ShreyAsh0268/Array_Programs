import java.util.*;
public class Find_longest_Consecutive_Subsequence {
	public static void main(String []args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter Size Of Array");
//		int size=s.nextInt();
//		System.out.println("Enter Elements In Array");
		int a[]= {3,4,5,1,2,3,4,5};
		
		/*for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}*/
		
		
		int cl=1;			//cl = current length
		int ml=1;			//ml = max length
		int start=0;		//start = start index
		int ms=0;			//ms = max start index
		
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]-1) {
				cl++;
				if(cl>ml) {
					ml=cl;
					ms=start;
				}
			}
			else {
				start=i+1;
				cl=1;
			}
		}
		
		for(int i=ms;i<ml+ms;i++) {
			System.out.println(a[i]);
		}
	}
}
