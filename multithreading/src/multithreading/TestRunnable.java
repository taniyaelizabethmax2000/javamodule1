package multithreading;

public class TestRunnable {

	public static void main(String[] args) {
		//since the child thread takes time to execute main thread will execute
       
		System.out.println("Main Started.....");
		System.out.println("Mains priority="+Thread.currentThread().getPriority());//main thread has priority
		MyRunnable runnable = new MyRunnable();//output 5 gives norms priority
		Thread t1 = new Thread(runnable);//only  thread instances can start
		Thread t2 = new Thread(runnable);
		t1.setDaemon(true);
		t2.setDaemon(true);//if it is daemon it wont wait for another threads
		t1.start();
		t2.start();
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("T1's priority =" + t1.getPriority());
		System.out.println("main exited....");
		System.out.println("T2's priority="  + t2.getPriority());//5 becoz of inheritance. main threads priority is taken by child
	}

}
