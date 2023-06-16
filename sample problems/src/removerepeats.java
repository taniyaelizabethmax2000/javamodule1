import java.util.ArrayList;


public class removerepeats {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
        	
        	ArrayList<Character> list=new ArrayList<>();
        String str="aataniyaa";
//        	char arr[] =str.toCharArray();
//	
//		for(int i=0;i<str.length();i++){
//		    list.add(arr[i]);
//		}
//		System.out.println(list);
//	char[] arr1=new char[list.size()];
//	for(int j=0;j<list.size();j++) {
//		arr1[j]=list.get(j);
//	}
//	for(int k=0;k<arr1.length;k++) {
//		System.out.println(arr1[k]);
//	}
//    
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(!(list.contains(c))) {
				list.add(c);
				
			}
			
			
		}
		char[] arr1=new char[list.size()];
		for(int j=0;j<list.size();j++) {
		arr1[j]=list.get(j);
	}
		for(int k=0;k<arr1.length;k++) {
		System.out.println(arr1[k]);
	}
	}

}
