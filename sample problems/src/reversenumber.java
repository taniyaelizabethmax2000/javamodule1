
public class reversenumber {

	public static void main(String[] args) {
		int num=567;
		int sum=0;
		int rem=0;
		for(int i=0;i<num;i++) {
			rem=num%10;
			sum=sum*10+rem;
			num=num/10;
		}
System.out.println(sum);
	}

}
