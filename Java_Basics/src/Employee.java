
public class Employee {

	int empID; 
	float empSalary;
	String empName;
  // these are instance variable which can use throughout the class.
	
	public Employee(int empID, int empSalary, String empName) {
		// In parameter those are local variable which can only use in this constructor only.
		// Employee is a parameterized constructor.
 		// We can overload the constructor but we can't override it. 
		this.empID = empID;
		this.empSalary= empSalary;
		this.empName = empName;
		
		
	}
	 // this keyword is used for avoid conflict between local and instance variable
//	void setEmp() {
//
//		empID = 123;
//		empSalary = 25000;
//		empName = "Twinkal";
//
//	}

	void getEmp() {
        if(empSalary>5000)
        	System.out.println("Please pay tax"+ (empSalary/10));
        else System.out.println("Enjoy tax free");
		System.out.println("Employee ID is "+empID);
		System.out.println("Employee salary is "+empSalary);
		System.out.println("Employee Name is "+empName);

	}
	
	public static void main(String[] args) {
		Employee employee1 = new Employee(123, 25000, "Patel");
		Employee employee2 = new Employee(123, 27000, "Gaurav");
		Employee employee3 = new Employee(123, 28000, "Arora");
//		employee.setEmp();
		employee1.getEmp();
		employee2.getEmp();
		employee3.getEmp();
	}
}
