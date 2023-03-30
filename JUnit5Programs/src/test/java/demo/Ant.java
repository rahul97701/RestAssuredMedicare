package demo;

public class Ant implements Behaviour {
	
	public void sleep() {
		System.out.println("An ant sleeps for 2 hours");
	}
	
	public void eat() {
		System.out.println("Ant eats leftover dead insects");
	}
	
	public void run() {
		System.out.println("Ant runs at 2m/hour");
	}

}
