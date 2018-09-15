package qshore;

public class Cat implements Animal {
	String name = "";
	
	public void legs() {
		System.out.println("4 legs");
	}
	public void legs(int number) {
		System.out.println(number  + " legs");
	}
	public void eat() {
		System.out.println("drinks milk");
	}
	public String getName() {
		return name;
	}
	public void sleep() {
		System.out.println("Always sleepy");
	}
	
	public void runs() {
		System.out.println("Cat runs");
	}
	
	public void sample() {
		Cat c = new Cat();
		c.sleep();
		
		sleep();
		
	}
}
