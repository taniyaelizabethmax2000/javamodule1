package functionalinterfaces;
import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;

public class ConsumerTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Andhra Pradesh", "Tamilnadu", "Telangana", "Kerala", "Karnataka");
        Consumer<String> consumer=(str)->{
        	System.out.println(str);//consumer takes input but do not return a value but prints the string.as here return type is void
        };//it dont require a return like lambda
		
			consumer.accept("I am doing great");
			for(String str:strings) {
				consumer.accept(str);
			}
			printStrings(strings,consumer);
	}//end of main

	public static  void printStrings(List<String> strings,Consumer<String> c) {
		for(String str:strings) {
			c.accept(str);
		}
	}
}
