package Operators;

public class Logical {

	public static void main(String[] args) {
		
		System.out.println("AND");
		System.out.println((5 > 3) && (8 > 5));  
	    System.out.println((5 > 3) && (8 < 5));  
	    
	    System.out.println("OR");
	    System.out.println((5 < 3) || (8 > 5));  
	    System.out.println((5 < 3) || (8 < 5));  	    
	    
	    System.out.println("NOT");
	    System.out.println(!(5 == 3));  
	    System.out.println(!(5 > 3));  

	}

}
