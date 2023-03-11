package listdemo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class TestLinkedList {

	public static void main(String[] args) {
		
     LinkedList<String> list =new LinkedList<>();//<String> is for type safety
     list.add("marker");
     list.add("Pencil");
     list.add("book");
     list.add("eraser");
     list.add("Sharpner");
     
     System.out.println(list);
     System.out.println(list.size());
     System.out.println(list.getFirst());
     System.out.println(list.getLast());
     System.out.println(list.get(2));
     list.add(2, "sticky notes");
     System.out.println(list);
     
     
     Iterator<String> iter =list.descendingIterator();
     while(iter.hasNext()) {
    	 System.out.println(iter.next());//arraylist do not have descending iterator whereas linkedlist has descending iterator where can print from backwards
     }
     
     ListIterator<String> listIter=list.listIterator();
     while(listIter.hasNext()) {
    	 System.out.println(listIter.next());
     String element = listIter.next();
     if(element.equals("Pencil")){
    	listIter.remove();
     }
	}
System.out.println(list);
	}
}