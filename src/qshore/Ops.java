package qshore;

public class Ops {

	
	
	public static void main(String[] args) {
		
		
		Result result = new Result();
		Student s = result.getStudent("bharath");
		String name = s.getName();
		System.out.println(name);
		
		String ss=  result.getStudent("aaa").getName();
		
		
	}
}
