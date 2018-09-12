package qshore;

public class Dog implements Animal{
	String name ="";
	public void legs() {
		System.out.println("4 legs");
	}

	public void eat() {
		System.out.println("Eats nonveg");
	}

	public String getName() {
		return null;
	}

	public void sleep() {
		System.out.println("always sleepy");
	}

	@Override
	public void runs() {
		
	}

}
