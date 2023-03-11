package functionalinterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("ola", "o");
		map.put("Hello", "H");
		map.put("Chao", "C");
		map.forEach((k,v)->
		System.out.println(k+"For"+v));
		BiConsumer<String,String> bi=(k,v)->System.out.println(k+"For"+v);//consumes 2 inputs by biconsumer
		map.forEach(bi);

	}

}
