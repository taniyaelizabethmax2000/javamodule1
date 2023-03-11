package exceptionsday6;

public class exceptiondemo3 {

	public static void main(String[] args) {
		System.out.println("Program task begins..");
		try {
			System.out.println("entered try...");
			int c =10/0;
			System.out.println("from try afterexception....");
		} catch (Exception e) {
			System.out.println("from catch");
	//		catch(ArithMeticException e) {
				//error
		//	}
		} finally {
			System.out.println("from finally");
		}
		System.out.println("Program completed task..");
	}
}