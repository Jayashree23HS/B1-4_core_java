package Operators;

public class Increment {

	public static void main(String[] args) {
		 int a = 12;
		    int result;

		    
		    System.out.println("Value of a: " + a);
		    result = ++a;
		    System.out.println("After increment: " + result);

		    System.out.println("Value of a: " + a);
		    result = a++;
		    System.out.println("After increment: " + result);

		    System.out.println("Value of a: " + a);
		    result = --a;
		    System.out.println("After decrement: " + result);

		    System.out.println("Value of a: " + a);
		    result = a--;
		    System.out.println("After decrement: " + result);
		

	}

}
