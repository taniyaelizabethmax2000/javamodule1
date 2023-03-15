package firsttest;

public class Calculator {

	
	public int power(int b, int e) {
       int s=1;
       if(b==0 || e==0)
    	   return 0;
       else {
		for(int i=1;i<=e;i++) {
			s=s*b;
	}
       }
		return s;
	}
	
	public int factorial(int num) {
		int fact=1;
		if(num==0)
			return 0;
		else {
		while(num!=0) {
			fact=fact*num;
			num--;
					
		}
		}
		return fact;
	}
	public int add(int x,int y) {
		int c=0;
		c=x+y;
		return c;
	}
}
