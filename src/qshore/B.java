package qshore;

public class B extends A{

	public void test3() {
		a =20;
		d=50;
		A aa  = new A();
		aa.testa();
		testa();
		d=100;
		a=30;
		aa.a=40;
		aa.testa();
		testa();
	}
	
	public static void main(String[] args) {
		B bb = new B();
		bb.test3();
	}
}
