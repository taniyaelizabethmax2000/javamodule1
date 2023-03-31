package splitperson;

import java.util.ArrayList;
import java.util.Scanner;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		ArrayList<Integer> person = new ArrayList<Integer>();
		System.out.println("Enter the amount");
		Scanner sc=new Scanner(System.in);
		int amount=sc.nextInt();
		System.out.println("Enter the number of peoples for split:");
		int p=sc.nextInt();
		for(int i=0;i<p;i++) {
			System.out.println("Enter the amount:");
			person.add(sc.nextInt());
				
			}
		for(int i=0;i<p;i++) {
			sum=sum+person.get(i);
		}
		
		if(sum==amount) {
			System.out.println("amount is finished");
		}
		else {
			int d=amount-sum;
			System.out.println("balance amount is "+d);
		}
	}

}
