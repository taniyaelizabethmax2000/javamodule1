import java.util.Arrays;

public class prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strs= {"flower","flow","flight"};
		Arrays.sort(strs);
		String s=strs[0];
		//System.out.println(strs[1]);
        for(int i=0;i<s.length();i++){
         for(int j=1;j<strs.length;j++){
            if(s.charAt(i)!=strs[j].charAt(i)){
            	System.out.println(s.substring(0,i));
            }
        }
        }
        System.out.println(strs[0]);
	}

}
