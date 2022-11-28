
public class PoolDemo {

	
	public static void main(String[] args) {

	String s = "java"; // String pooling
	
	//String is mutable 
	//if i want to print concated value you have to make string immutable.
	
	
	 s = s.concat("is a programming language");
	
	System.out.println(s);
	
	}
	
}
