package factorymethod;

public class seltos implements vehicle {

	@Override
	public void start() {
		System.out.println("Started....."+ getClass());

	}

	@Override
	public void stop() {
		System.out.println("Stopped....."+ getClass());


	}

	@Override
	public void honk() {
		System.out.println("Palm Palm....."+ getClass());


	}

	@Override
	public void move() {
		System.out.println("Its moving....."+ getClass());


	}

}
