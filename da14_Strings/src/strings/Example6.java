package strings;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str1=s.nextLine();
		String str2=s.nextLine();

		System.out.println(10+20+"hello"+"world"+10+20);
		//before string it will add two values after string value it will give as it is  10+20
		System.out.println(str1.concat(str2));
		s.close();



	}

}
