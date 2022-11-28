import java.util.Iterator;

public class StringDemoSec {

	
	public static void main(String[] args) {
		
		
		String s = "It is my practice to become a fullstack developer";
		
		char c[] =  s.toCharArray();
		
		for(int i = 0; i<c.length; i++) {
			
			//System.out.println(c[i]);
			//System.out.println(s.toUpperCase());
			
		  //System.out.print(c[i] + "\t"); if you want to print in single line just remove ln form println.
	      // t is used for tab. tab means to make a space between characters.
			//system.out.print(c[i] + " ") It will print space between characters.
			
			//System.out.println(s.substring(9, 17)); // to print particular word from whole sentence. Give start and end letter index.
		//	System.out.println(s.endsWith("developer")); // to check last word of sentence.
		   // System.out.println(s.startsWith("It"));
		   // System.out.println(s.contains("full"));// to check that sentence has this word or not.
		    
		    String st[] = s.split(""); // to convert characters into string.
		    for (int j = 0; j < st.length; j++) {
		    
		    	System.out.println(st[j]);
				
			}
		    
		  
		
		}
		
		
	}
}
