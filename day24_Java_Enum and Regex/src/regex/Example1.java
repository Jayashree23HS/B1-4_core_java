package regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Example1 {

	public static void main(String[] args) {
		String pattern="john josh";
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		
		//String input="john Josh";//capital J so it shoes false
		boolean Result=Pattern.matches(pattern, input);
		System.out.println(Result);

	}

}
