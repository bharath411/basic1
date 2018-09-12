package qshore;

public class Marks {

	
	public static void main(String[] args) {
		
		int marks = -174;
		if( marks<40 ) {
			if(marks<0) {
				System.out.println("Not Valid");
			}else {
				System.out.println("FAIL");
			}
		}else if(marks<=100){
			System.out.println("PASS");
		}else {
			System.out.println("Not Valid");
		}
		
		if(marks<0 || marks>100) {
			System.out.println("Not Valid");
		}else if( marks<40 ) {
			System.out.println("FAIL");
		}else {
			System.out.println("PASS");
		}
		
	}
}
