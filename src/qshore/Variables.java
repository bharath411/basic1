package qshore;

public class Variables {

	int b = 10;// instance variable
	int a = 30;

	public void test1() {
		int a = 10;// local variable
		System.out.println(b);
		System.out.println(a);
		System.out.println(this.a);
	}

	public void test2() {
		int a = 20;
		System.out.println(a);
		System.out.println(b);
	}

	public void test2(int a) {
		System.out.println(a);
	}

	public void test2(long b) {
		System.out.println(b);
		test2(10,10l);
	}

	public void test2(int a, long b) {

	}

	public void test2(long d, int f) {

	}
}
