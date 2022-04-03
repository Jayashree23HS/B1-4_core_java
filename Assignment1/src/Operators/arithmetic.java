package Operators;
import java.util.Scanner;


public class arithmetic {

	public static void main(String[] args) {
		
		        Scanner in = new Scanner(System.in);
		        
		        System.out.println("Enter first number :");
		        int a = in.nextInt();
		        System.out.println("Enter second number :");
		        int b = in.nextInt();
		        
		        int sum 		= a + b;
		        System.out.println("Sum of two numbers : " + sum);
		        int difference 	= a - b;
		        System.out.println("Difference of two numbers : "  + difference);
		        int product 	= a * b;
		        System.out.println("Product of two numbers : " + product);
		        int division	= a / b;
				System.out.println("Division of two numbers : " + division);
		        int modulo	    = a % b;
		        System.out.println("Modulo of two numbers : "  + modulo);
		        in.close();
		
	}

}
