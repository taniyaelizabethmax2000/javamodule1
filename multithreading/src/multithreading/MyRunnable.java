package multithreading;
import java.util.Scanner;
//myrunnable provides space for runnable.myrunnable is not a thread.by implementing it becomes surrogate only,

public class MyRunnable implements Runnable {

	@Override//run method is entry point for every child thread.every thread will search for run method
	//role of object monitor is to  look which thread is inside or not.
	public void run() {
	
		for(int i=1;i<=5;i++) {
			System.out.println("Enter your input");
			int a=new Scanner(System.in).nextInt();
			System.out.println("Got the input Proceeding");
			System.out.println(Thread.currentThread().getName()+" = " +i);
	    
			try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
	}

}
