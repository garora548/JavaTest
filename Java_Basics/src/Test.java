
public class Test {
	
   final  int x; //  Immutable variable. Once we assign the value we can't change it.
	public Test(int x) {
		
		this.x = x;
		

	}

     void getX() {
    	 
    	 System.out.println(x);
    	 
     }
     
     public static void main(String[] args) {
		
    	 
    	 Test t = new Test(100);
    	// t.x = 300;
    	 t.getX();
	}
}
