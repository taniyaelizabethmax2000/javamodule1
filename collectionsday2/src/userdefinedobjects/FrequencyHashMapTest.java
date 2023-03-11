package userdefinedobjects;

import java.util.Collection;
import java.util.HashMap;

public class FrequencyHashMapTest {

	public static void main(String[] args) {
		int i=0;
		int count=0;
		String st=new String("This  class consists exclusively of static methods that operate on or return collections. It contains polymorphic algorithms that operate on collections, \"wrappers\", which return a new collection backed by a specified collection, and a few other odds and ends.");
        String str=st.toLowerCase();
		String words[]=str.split(" ");
        for(i=0;i<words.length;i++) {
        	System.out.println(words[i]);
        	count++;   
        }
        	
         System.out.println(count);
        HashMap<String,Integer> dataMap = new HashMap<>();
        for(String word:words) {
        	Integer integer =dataMap.get(word);
        	if(integer!=null)
        		dataMap.put(word, integer+1);
        	else
        		dataMap.put(word, 1);
        }
        System.out.println(dataMap);
        
	}
	
}
//string words[]
//system.out.println("Total words="+words.length);
//HashMap<String,Integer> test = new HashMap<>();
//fpr(int i=0;i<words.length;i++){
//Integer freq=test.get(words[i]);
//if(freq!=null){
//int count=test.get(words[i]);
//test.put(words[i],++count);
//}
//else {
//test.put(words[i],1);(freq+" is null")
//}





//int n=10;
//String s=new String("10");
//
//
////n=s.intValue();
//
////from Integer to String
//String s2=integer.toString();
//integer=s2.intValue();