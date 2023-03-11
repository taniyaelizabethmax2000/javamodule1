package listdemo;
import java.util.ArrayDeque;
import java.util.Iterator;
public class TestArrayDeque {

	public static void main(String[] args) {
		
    ArrayDeque<String> queue = new ArrayDeque<>();
    queue.addLast("first");
    queue.addLast("second");
    queue.addLast("third");
    queue.addLast("fourth");
    queue.addLast("fifth");
    
    
    System.out.println(queue);
    System.out.println(queue.size());
    
    
    String element = queue.peek();//queue.getFirst(); peek is for getting first element and poll removes the first element
    System.out.println(element);
    queue.pollFirst();
    System.out.println(queue);//first element is removed
    
    
    Iterator<String> iter = queue.iterator();
    while(iter.hasNext()) {
    	System.out.println(iter.next());//hasnext pointers to the element and the while loop executes true if an element presents and when iter.next is called the current element of hasnext is retrieved by next and next moves the pointer of hasnext to another element.
    }
    
    
    
	}

}
