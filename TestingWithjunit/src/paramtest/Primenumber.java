package paramtest;

public class Primenumber {

	public boolean validate(int n){
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
		}
		
	}
	return true;
}
}