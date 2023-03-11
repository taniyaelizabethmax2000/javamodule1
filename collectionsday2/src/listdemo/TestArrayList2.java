package listdemo;
import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList2 {

	public static void main(String[] args) {
		//<string> is type of list
		//UNIQUE ITEMS,no duplicate values-hashset
		//indexorder needed-array
		//duplicate values allow-list
 ArrayList<String> colors = new ArrayList<String>();//arraylist produce only strings
// colors.add(new Object());//from generic it is now added <string> gives specific string that is string
// colors.add(new Double("10.10"));(only strings can be added not double)
 //specific is homogenous collection.
 colors.add("Blue");
 colors.add("Green");
 colors.add("Red");
 colors.add("Yellow");
 colors.add("Orange");
 colors.add(null);
 
 String str = colors.get(5);
 System.out.println(str);
	}

}
