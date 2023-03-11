package listdemo;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {

	public static void main(String[] args) {
		
ArrayList flowers = new ArrayList();
flowers.add(new Integer("1"));
flowers.add(new java.util.Date());
flowers.add(new java.util.Scanner(System.in));
flowers.add(new Double("10.10")); //generic means we can put anything.

flowers.add("Tulips");
flowers.add("Rose");
flowers.add("Jasmine");
flowers.add("Lilly");
flowers.add("Cosmos");


//System.out.println("hello".length());
//String str=(String)flowers.get(3);//double cannot be converted to string.since all of them should be in 1 type in arraylist
Object obj = flowers.get(3);
if(obj instanceof Integer) {
	Integer in =(Integer)obj;
	System.out.println(in.MIN_VALUE);
	}
else if(obj instanceof Double) {
	Double d = (Double)obj;
	System.out.println(d.MAX_VALUE);
}
else if(obj instanceof String) {
	String str1 = (String) obj; //since it is a generic collection we cast it to string.generic means heterogeneous
	System.out.println(str1.toUpperCase());
}

//System.out.println(flowers); //cannot print array if array is empty
//System.out.println(flowers.size());//just for stringlength in array.
//System.out.println(flowers.get(2));//jasmine
//System.out.println(flowers.contains("lilly"));//elements are case sensitive .small letter l //true
//
//flowers.add(2,"Sunflower");
//System.out.println(flowers);
//		for(Object obj :flowers)
//		{
//			System.out.println(obj);
//		}
//		flowers.remove(2);
//		System.out.println(flowers);
//		
//		
//		Iterator iter = flowers.iterator();
//		
//		while(iter.hasNext()) {
//			
//			System.out.println(iter.next());//another way of printing arrayelements
//		}
//		
//		
//		for(int i=0;i<flowers.size();i++) {
//			System.out.println(flowers.get(i));//another way of printing array elements
//		}
	}

}
