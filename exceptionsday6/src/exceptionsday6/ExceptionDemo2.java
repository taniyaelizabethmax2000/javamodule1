package exceptionsday6;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("Program begins");
		try {
			
		
		int b=Integer.parseInt(args[0]); //args is known as command line arguments."10","20"
		int a=Integer.parseInt(args[1]);
		int c =b/a;
		String name = args[2]; //what compiler cant find it throws exception. //if we give 10 it is taken as string.no error.given it gives implicitly "" inside.
		int data[]= {a,b};
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(Exception e) { //it is like default in exception
		
			e.printStackTrace();
		}
		
        System.out.println("Program task completed..");
	}

}
