import java.util.ArrayList;

public class Student {


	private int studentId;
	private String studentFName;
	private String studentLName;
	private float studentMarks;


	public Student(int studentId, String studentFName, String studentLName, float studentMarks) {

		this.studentId = studentId;
		this.studentFName = studentFName;
		this.studentLName = studentLName;
		this.studentMarks = studentMarks;


	}
	
	

	void getStudent() {

		
		String result = studentFName + studentLName+ " " + studentId + " " + studentMarks;
	if(studentMarks<50)	{
		
//	System.out.println("Student ID is "+studentId );
//    System.out.println("Student Name is "+studentFName);
//	System.out.println("Student Last Name is "+ studentLName);
//	System.out.println("Student Marks is"+ studentMarks);
		System.out.println("You are fail");
	}
	else {
		System.out.println("You are pass");
	}
	    System.out.println(result);

	

	}

	public static void main(String[] args) {

		
		ArrayList<Student> myList = new ArrayList<Student>();

		myList.add(new Student(01, "Twinkal", "Patel", 50));
		myList.add(new Student(02, "Gaurav", "Arora", 30));
		myList.add(new Student(01, "Het", "Patel", 55));
		
		for (Student st : myList) {
		  st.getStudent();
		}

	}





}
