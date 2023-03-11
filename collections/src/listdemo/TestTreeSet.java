package listdemo;
import java.util.TreeSet;//treeset sort the elements whereas hashset do not sort elements
import java.util.Iterator;//we can add strings and objects to collection.not primitives is added for collection
public class TestTreeSet {

	public static void main(String[] args) {
		
		TreeSet<String> bookSet = new TreeSet<>();//string type
       bookSet.add("Java in nutshell");
       bookSet.add("Java complete reference"); //java is first word and sorts them based on alphabetical
       bookSet.add("Thinking in Java");
       bookSet.add("Java in 21 days");
       bookSet.add("Java for dummys");
      // bookSet.add(null);//treeset does not allow null elements.
       
       System.out.println(bookSet);
       System.out.println(bookSet.size());
       System.out.println(bookSet.contains("java in nutshell"));
       
       
       bookSet.add("thinking in Java");
       
       for(String book:bookSet) {
    	   System.out.println(book);
       }
       
       Iterator<String> iter = bookSet.iterator();
       while(iter.hasNext()) {
    	   System.out.println(iter.next());
       }//another way of printing bookset.
	}

}
