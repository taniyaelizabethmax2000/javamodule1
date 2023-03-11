package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
	
		ArrayList<String> list = new ArrayList();
		list.add("sun");
		list.add("moon");
		list.add("jupiter");
		list.add("uranus");
		list.add("pluto");
		list.add("mars");
		list.add("venus");
		
		Predicate<String> p=(str)->{
		return str.length()>3 || str.length()<10;
		};
		
long count=list.stream().filter((str)->str.length()>3|| str.length()<10).count();//implicit navigation
System.out.println(count);//stream contains all the records of listand it will take 1 by 1 from all data and it will check with condition of length and 
//if that condition true for each object in list count increases.
long cou=list.stream().filter(p).count(); //filter takes predicate
System.out.println(cou);//map takes function
// terminal operation takes consumer
List<String> outList=list.stream().map((str)->str.toUpperCase()).collect(Collectors.toList());//here terminal operator is collecto
System.out.println(outList);//there will be terminal operator for stream.there will be map and filter for stream.

Function<String,String> f =(str)->{ //same as previous line another method using map and function
	return str.toUpperCase();
};
List<String> outList1 = list.stream().map(f).collect(Collectors.toList());
System.out.println(outList1);
//forEach is terminal operator.
Consumer<String> c =(str)->{
	System.out.println(str);
};
list.stream().forEach(c);
//list.stream().forEach(System.out::println);//terminal operator

//combining filter,map and consumer
list.stream().filter(p).map(f).forEach(c);
	}
//first filter the data then perform the transformation and at last printing the statement use foreach
}
