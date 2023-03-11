package listdemo;
import java.util.HashSet;//hashset will not allow duplicates
import java.util.Iterator;//we can add strings and objects to collection.not primitives is added for collection
public class TestHashSet {

	public static void main(String[] args) {
		
		HashSet<String> bookSet = new HashSet<>();//string type
       bookSet.add("Java in nutshell");
       bookSet.add("Java complete reference");
       bookSet.add("Thinking in Java");
       bookSet.add("Java in 21 days");
       bookSet.add("Java for dummys");//no order for output.can come in any order
       bookSet.add(null);
       bookSet.add(null);//1 null will take.
       //arraylistfamily so many null
       //hash 1 null take
       //tree no null will take
       System.out.println(bookSet);//no get method in set we can only check if a book is present
       System.out.println(bookSet.size());
       System.out.println(bookSet.contains("java in nutshell"));//false case sensitive useJ instead of j
       
       
       bookSet.add("thinking in Java");//not added .it does not allow duplicate elements.
       
       for(String book:bookSet) {
    	   System.out.println(book);//colection do not throw exception .it says true or false.
       }
       
       Iterator<String> iter = bookSet.iterator();
       while(iter.hasNext()) {
    	   System.out.println(iter.next());
       }//another way of printing bookset.
	}

}
