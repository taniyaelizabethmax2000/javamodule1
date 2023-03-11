package listdemo;
import java.util.Collection;
import java.util.HashMap;//Hashmap we will always store pair values.i.e,2 values.hashmap is keyvalue is pair.
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class TestHashMap {

	public static void main(String[] args) {
		HashMap<String,String> countryCurr = new HashMap<>();
	countryCurr.put("IND", "Rupe");//no insertion order is required while printing in hashmap and it is case sensitive
	countryCurr.put("USA", "Dollar");
	countryCurr.put("UK", "Pound");
	countryCurr.put(null, null);
	countryCurr.put(null, null);//1 null is taken
		
    System.out.println(countryCurr);
    System.out.println(countryCurr.get("IND"));//if we dont know the key we dont get any value.
    countryCurr.put("IND", "Rupee");
    System.out.println(countryCurr);//if we put key with new value it will replace old rupe with rupee.value can overriden by searching the key
    System.out.println(countryCurr.size());
    System.out.println(countryCurr.containsKey("UK"));
    System.out.println(countryCurr.containsValue("Dollar"));
    
    //HashMap has 3 views
    //1.keyview
    
    
   Set<String> keys = countryCurr.keySet();
    for(String key :keys) {
    	System.out.println(key); //to get keys
    }
    
	
	
 //2.Values view
	
	Collection<String> values = countryCurr.values();
	for(String value:values) {
		System.out.println(value);
	
	}
	
	
	//3.key values together- entrySet
	
	Set <Entry<String,String>> entries = countryCurr.entrySet();
	for(Entry<String,String> entry : entries) {
		System.out.println(entry);
	}
	
}}
