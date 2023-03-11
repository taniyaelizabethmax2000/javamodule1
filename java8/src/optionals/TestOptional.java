package optionals;

import java.util.Optional;

//optional is null testing without using null keyword.why do we test null so we dont get nullpointer exception.
public class TestOptional {

	public static void main(String[] args) {
		
String str=null;
String str2="hello";
//Optional<String> optional=Optional.of(str);//throws exception
//System.out.println(optional.get()); //when we use of we get exception.if there is no null we can give optional.of
	//Optional<String> optional2 =Optional.ofNullable(str);
	//System.out.println(optional2.get());//exception occurs
	
Optional<String> optional2 =Optional.ofNullable(str2);
	
	if(optional2.isPresent())
	System.out.println("value is present"+optional2.get());
	else
		//System.out.println("is null"+optional2.get());//when str2 is passed it will execute if. str is pass else condition is executed and no value
	//present error occur
		System.out.println("is null" + optional2.orElse("str not initialized"));//if we know null is present
	}

}
