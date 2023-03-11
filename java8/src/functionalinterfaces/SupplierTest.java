package functionalinterfaces;
import java.util.function.Supplier;
import java.util.Arrays;
import java.util.List;

public class SupplierTest {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Andhra Pradesh", "Tamilnadu", "Telangana", "Kerala", "Karnataka");
         Supplier<String> supplier =()->{
        	 return new String("Hola!");
         };//no return for consumer ,just like void function.
         System.out.println(supplier.get());//supplier has return.has only output
         
	}

}
