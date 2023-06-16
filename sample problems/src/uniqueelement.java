import java.util.ArrayList;
import java.util.List;

public class uniqueelement {

	public static void main(String[] args) {
		
      String s="bbbttg";
List<Character> l =new ArrayList<Character>();
//List<Character> li =new ArrayList<Character>();
for(int i=0;i<s.length();i++) {
	char c=s.charAt(i);
	if(!(l.contains(c))) {
		l.add(c);
	}
	else {
		
		l.remove(Character.valueOf(c));
	}
//	l.add(s.charAt(i));
}

if(!l.isEmpty()) {
	char c=l.get(0);
	int m=l.indexOf(c);
	System.out.println(m);
}

//for(int i=0;i<l.size();i++) {
//	for(int j=i+1;j<l.size();j++) {
//		if(l.get(i)==l.get(j)) {
//			l.remove(i);
//			l.remove(j);
//			
//			
//		}
//	}
//}

//for(int i=0;i<l.size();i++) {
//	li.add(l.get(i));
//	
//}
//for(int k=0;k<l.size();k++) {
//	if(!(li.contains(l.get(k)))) {
//		li.add(l.get(k));
//	}
//}
//System.out.println(li);
	}

}
