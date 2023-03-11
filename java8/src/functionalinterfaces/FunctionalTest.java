package functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Andhra Pradesh", "Tamilnadu", "Telangana", "Kerala", "Karnataka");

		Function<String, Integer> f = (str) -> {// string is input and integer is return type
			return str.length();
		};

		// Function for uppercase
		Function<String, String> up = (str) -> {
			return str.toUpperCase();
		};
		Function<String,String> lo=(str) ->{
			return str.toLowerCase();
		};
		Function<String,String> rev=(str) ->{
			StringBuilder sb=new StringBuilder(str);
			sb.reverse();
			return sb.toString();
		};
		// Function for lowercase
		//Function for uppercase
		// Function for reverse
		printLength(strings, f);
		printtoUpperCase(strings, up);
		printtoLowerCase(strings,lo);
		printtoReverse(strings,rev);
//printUpperCase
//printLowercase
//printReverse	

	}// main ends

	public static void printLength(List<String> strings, Function<String, Integer> fRef) {
		for (String str : strings) {
			System.out.println(fRef.apply(str));
		}
	}

	public static void printtoUpperCase(List<String> strings, Function<String, String> fRef) {
		for (String str : strings) {
			System.out.println(fRef.apply(str));

		}
	}
	public static void printtoLowerCase(List<String> strings,Function<String,String> fRef) {
		for (String str : strings) {
			System.out.println(fRef.apply(str));
	}
}
	
	public static void printtoReverse(List<String> strings,Function<String,String> fRef) {
		for (String str : strings) {
			System.out.println(fRef.apply(str));
	}
}
}
