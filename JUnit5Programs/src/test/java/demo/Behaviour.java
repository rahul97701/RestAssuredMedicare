package demo;

public interface Behaviour {
	
 public void sleep() ;
 
 public void eat();
 
 public void run();
 
 default void fly() {
	 System.out.println("Only birds and insects can fly, Mammals cannot "); 
	 
 }
	

}
