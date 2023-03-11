package strings;

public class TestStrings {

	public static void main(String[] args) {
		
		byte bytes[] = {65,66,67,68,69};
		int count=0;
	String str = new String(bytes);
	System.out.println(str.length());
	System.out.println(str);
	str = "Welcome to UST Global";
bytes = str.getBytes();
for(byte b:bytes) {
	System.out.println(b);
}

char chars[] = {'U','S','T',' ','G'};
str=new String(chars);
System.out.println(str);
str.getChars(0, chars.length-1, chars, 0);
for(char c:chars) {
	System.out.println(c);
}
//integer i=new Integer(8);//deprecated

String string = new String("she sells sea. shells in sea. shore");
for(int i=0;i<string.length();i++) {
	char c=string.charAt(i);
if(c=='s') {
	count++;
}
else if(c=='S') {
	count++;
}

	}
System.out.println(count);

String words[]=string.split("[.] ");//[.] IS regular expression.
System.out.println(words.length);
for(String word: words) {
	System.out.println(word);
}
string = new String("Cartoon");
System.out.println(string.startsWith("Car"));
System.out.println(string.endsWith("toon"));


int apos = string.indexOf('a');
int tpos = string.indexOf('t');

String string2 = string.substring(apos,tpos+1);
System.out.println(string2);
  string2=string.substring(tpos);
   System.out.println(string2);//beginning index to last letter is counted
   
   string = new String("madamdam");
   
   int dpos = string.lastIndexOf('d');
   System.out.println(dpos);
   string2= string.substring(dpos,string.length());
   System.out.println(string2);
   
   String email =new String("taniya.elizabeth@ust.com");
   int cpos = email.lastIndexOf('c');
   System.out.println(cpos);
  String email2 =email.substring(cpos, email.length());
   System.out.println(email2);
	
   
   String str1=new String("welcome");
   String str2=new String("WELCOME");
   boolean result =str1.equalsIgnoreCase(str2);
   System.out.println(result); //not hashcode the letters are compared
   
   int val =str2.compareTo(str1);//str1 is compared to str2 -32 is ascii of l-L
   int val2=str1.compareTo(str2);
   
   System.out.println(val);
   System.out.println(val2); 
   
   string="Diehard";
   System.out.println(string.toLowerCase());//strings are immutable.we cannot change.their values cannot be changed .
   System.out.println(string);
   System.out.println(string.toUpperCase());//we cannot add anything in middle,front 
   System.out.println(string); //string does not support reversing.
   
   //they are immutable
   
   //"16-11-477/6/A/3 Hyderabad 500036"
   int digit=0;
   int alpha=0;
   int other=0;
   int space=0;
  String s="16-11-477/6/A/3 Hyderabad 500036";
  for(int i=0;i<s.length();i++) {
	  
	  if(Character.isDigit(s.charAt(i))) {
		  digit++;
  }
	 
	  else if(Character.isAlphabetic(s.charAt(i))) {
		  alpha++;
	  }
	  else if(Character.isSpaceChar(s.charAt(i))) {
		  space++;
	  }
	  
	  else {
		  other++;
	  }
  
	}
  System.out.println(digit);
  System.out.println(alpha);
  System.out.println(space);
  System.out.println(other);
	}
}
