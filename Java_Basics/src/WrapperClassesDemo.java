import java.util.Scanner;

public class WrapperClassesDemo {
	
	public static void main(String[] args) {
//		
//		System.out.println(args[0]+args[1]);  // whatever you pass in arguments java takes it as string 
//
//		
//		int a = Integer.parseInt(args[0]); // it is called as wrapper class 
//		
//		int b = Integer.parseInt(args[1]); // it converts string into integer 
//		
//
//		System.out.println(a+b);
//		
		
		
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("enter true or false");
		
		String v = scanner.next();  // 
		
		boolean b = Boolean.parseBoolean(v);
		
		System.out.println(b);
				
		
		
  Scanner scanner  = new Scanner(System.in);	// scanner class use to take input from user	
  
  System.out.println("enter studet name");  // system.in use to take input/read the input

  String name = scanner.nextLine();
  
  System.out.println("name is "+ name);
  
  System.out.println("enter marks");
  
  float marks = scanner.nextFloat();
  
  System.out.println("marks are"+ marks);
  
  System.out.println("enter your gender");
  
  
  String gender = scanner.next();
  
  char gen = gender.charAt(0);
  
  System.out.println("gender is"+ gen);
	}

}
