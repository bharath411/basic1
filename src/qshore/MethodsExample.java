package qshore;


public class MethodsExample {

	
	
	
	public void hi() {
		System.out.println("I am hi method");
	}
	
	public void add1(int a) {
		int b = 10;
		int c  =a + b;
		System.out.println(c);
	}
	
	public int add2(int a) {
		int b = 10;
		int c  =a + b;
		return c;
	}
	
	public int add3() {
		int a =100;
		int b = 10;
		int c  =a + b;
		return c;
	}
	
	
	public static void main(String[] args) {
		//How to create object
		
		MethodsExample m1 = new MethodsExample();
		new MethodsExample();
		
		
		m1.hi();
		int asd = m1.add3();
		m1.add1(10);
		
		int sm = m1.add2(asd);
		System.out.println(sm);
	}
	
	
	
	
	
	
	
	
}
