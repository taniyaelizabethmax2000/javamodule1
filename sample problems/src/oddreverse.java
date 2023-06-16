
public class oddreverse {

	public static void main(String[] args) {		
String s="odd even taniya taniy";
String[] arr=s.split(" ");
	for(int i=0;i<arr.length;i++) {
		if(arr[i].length()%2!=0) {
			StringBuilder sb=new StringBuilder(arr[i]);
		sb.reverse();
		arr[i]=sb.toString();
		
		}
		else {
			arr[i]=arr[i];
		}
		
	}
	//String snew=String.join(" ", arr);
	String snew="";
	for(int i=0;i<arr.length;i++) {
		snew+=arr[i];
		snew+=" ";
	}
	System.out.println(snew);
	
	}

}
