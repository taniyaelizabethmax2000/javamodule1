package functionalinterfaces;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class TestFunctionalInterfaces {

	public static void main(String[] args) {
		
		List<String> strings=
				Arrays.asList("Andra Pradesh",
				"Tamilnadu",
				"Telangana",
				"Kerala",
				"Karnataka");
		
		Function <String,Integer> f =(str)->{//string is input and integer is return type
			return str.length();
		};
		for(String str:strings) {
			System.out.println(f.apply(str));
		}
System.out.println(f.apply("Buneos dias"));//goes to function and count its length and return value

Function<Integer,Integer> f2 = (n)->{
	return n*n;
};
System.out.println(f2.apply(25)); //for using function we should use apply.from apply value is passed.
	

	Function<String,String> f3=(str)->{
		return str.toUpperCase();
	};
	System.out.println(f3.apply("kulatoor ust"));
	
	
}

}	

