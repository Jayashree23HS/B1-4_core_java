package exception;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		//anything divided by zero is not defined so it shows exception
		try {
		int res=a/0;
		System.out.println(res);
		}
		catch(Exception e) {
			System.out.println(e);//u can also print statement in parenthesis like exception handling
		} 
		finally {
			System.out.println("exception handlng in java");
		}
		
		s.close();

	}

}
