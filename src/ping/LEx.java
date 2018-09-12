package ping;

import java.util.HashMap;

public class LEx {

	
	public void test1() {
		String s = "bharath";
		String s1 = "bharath";
		
		String s2 = new String("bharath");
		String s3 = new String("bharath");
		
		System.out.println(s==s1);
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	}
	
	public void add(int a ,int b) {
		
		
	}
	
	public void add(int c,String d) {
		String st = " bharath";
		HashMap<Integer,Character> sta = new HashMap<Integer,Character>();
	}
	
	
	public static void main(String[] args) {
		LEx l = new LEx();
		l.test1();
		int aa = 20;
		boolean bbb = aa<10;
		
		A a  ;
		boolean boo = true;
		if(boo) {
			a = new A();
		}else {
			a = new B();
		}
			
		a.add();
	}
}
