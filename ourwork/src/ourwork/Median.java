package ourwork;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
		int a[]= {3,6,5,7,0,1,9,11,2,56};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
}
	
		if(a.length%2==0) {
			//int c=a[(a.length/2)-1]+a[((a.length/2)+1)-1];
			int c=a[(a.length/2)-1]+a[((a.length/2))];
			int result=c/2;
			System.out.println("median is"+result);
		}
		else {
			int result1=a[(a.length/2)];
			System.out.println("median is"+result1);
		}

}
}