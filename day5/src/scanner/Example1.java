package scanner;

import java.util.Scanner;

public class Example1
{	
	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	int age=s.nextInt();
	int weight=s.nextInt();
	
	if(age>18 && weight>50)
	{
		System.out.println("eligible to donate a blood");
	}
	else {
		System.out.println("not eligible to donate a blood");
	}
	s.close();

	
		
	}

}
