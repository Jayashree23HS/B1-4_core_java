package strings;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		String str="Dhoni";
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		if(str1.equals(str))
		{
			System.out.println("matching");
		}
		else {
			System.out.println("not matching");

		}
		s.close();


	}

}
