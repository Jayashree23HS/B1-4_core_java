package Looping;
import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int i=1;
		System.out.println("The multiplication table of "+n+" is:");
		do {
			System.out.println(n+"*"+i+"="+(n*i));
			i++;
		}
		while(i<=10);
		sc.close();
	}

}
