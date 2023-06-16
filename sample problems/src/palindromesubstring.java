import java.util.HashSet;
import java.util.Set;


public class palindromesubstring {
	public static  boolean Palindrome(String g){
		StringBuilder sb=new StringBuilder(g);
		sb.reverse();
		String snew=sb.toString();
		if(g.equals(snew)) {
			return true;
		}
		else {
			return false;
		}
	
	}

	public static void main(String[] args) {
		String s="bb";
		Set<String> set=new HashSet<>();
	
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length()+1;j++) {
				set.add(s.substring(i,j));
				
			}
		}
		//System.out.println(set);
		int max=0;
		String n="";
		System.out.println(set);
for(String t:set) {
	if(Palindrome(t)) 
	{ if(t.length()>max) {
		max=t.length();
		n=t;
	}
		
		}
}
	
	//System.out.println(t);

System.out.println(n);
		
	}

}
