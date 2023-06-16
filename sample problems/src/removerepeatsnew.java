
public class removerepeatsnew {
public static void main(String[] args) {
	String str="aataniyaann";
	String s = "";
	String s1="";
	
	for (int i = 0; i < str.length(); i++) {
		if (!s.contains(str.substring(i, i+1))) {
			s+=str.charAt(i);
		}
//		else {
//			s1+=str.charAt(i);
//		}
	}
System.out.println(s);
//System.out.println(s1);
}
}
