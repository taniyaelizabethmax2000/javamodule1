package functionalinterfaces;
import java.util.function.Predicate;
import java.util.Arrays;//predicate states whether a condition is true or false
import java.util.List;//functionalinterface looks for return value
//predicate is a condition and returns true or false
public class PredicateTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Andhra Pradesh", "Tamilnadu", "Telangana", "Kerala", "Karnataka");
 Predicate<String> p =(String str) ->{
	 return str.length() >10;
 };
 System.out.println(p.test("Holla!"));//false
// for(String str:strings)
//	 System.out.println(p.test(str));
 desiredLength(strings,p);
	
	
}//main ends
public static void desiredLength(List<String> strings,Predicate<String> p) {
	for(String str:strings)
		 System.out.println(p.test(str));
}

}