package qshore;

public class IntExample {

	
	
	public static void main(String[] args) {
		
		Animal an = null;
		String ani= "dog";
		if(ani.equals("cat")) {
			an = new Cat();
		}else if(ani.equals("dog")) {
			an = new Dog();
		}
		
		an.legs();
	}
}
