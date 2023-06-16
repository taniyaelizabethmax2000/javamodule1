
public class repeatingcharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
		String s="aabbccddeefaa";
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(arr[i]==arr[j]) {
					count=count+1;
				}
			}
		}
			System.out.println(count);	
	}

}
