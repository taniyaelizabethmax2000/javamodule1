package exceptionsday6;
import java.util.InputMismatchException;

import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		// int a =10;
		// int b=0;
		// int c=a/b;
		// System.out.println(c); //this code throws exception as a/b gives 0.

		System.out.println("Program task begins");
		try {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = a / b;// POINT of EXCEPTION.
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("cannot divide by zero");
		}catch(InputMismatchException e) {
			System.out.println("Invalid input format");
		}
		System.out.println("Program Completed task.");
	}
}
