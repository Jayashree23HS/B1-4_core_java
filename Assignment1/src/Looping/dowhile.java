package Looping;
import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   
	    int sum = 0;
	    int num = 0;

	    do {
	
	      sum += num;
	      System.out.println("Enter a number");
	      num = sc.nextInt();
	    } 
	    while(num >= 0); 
		   
	    System.out.println("The sum of entered positive numbers is " + sum);
	    sc.close();
	  
	}

}
