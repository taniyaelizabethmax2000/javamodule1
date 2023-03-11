package oopsday5.StateMachine;
import java.util.Scanner;
public class TestAtm {

	public static void main(String[] args) {
		
	menucall m =new menucall();
        for(int i=0;i<2;i++) {
		System.out.println("Enter amount which you want to withdraw");
		Scanner sc=new Scanner(System.in);
		int amount = sc.nextInt();
		System.out.println("Choose the denomination");
		System.out.println("How many 100rs notes needed");
		int d100=sc.nextInt();
		int x= m.deno100(amount,d100);
		System.out.println(x);
		System.out.println("How many 50rs notes needed");
		int d50=sc.nextInt();
		int y=m.deno50(amount,d50);
		System.out.println(y);
		System.out.println("How many 10rs notes needed");
		int d10=sc.nextInt();
		int z=m.deno10(amount,d10);
		
		

	}

}
}
