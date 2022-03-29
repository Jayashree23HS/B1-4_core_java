package git;
import java.util.Scanner;

public class sub {
public static void main(String[] args) {
        
        int num1, num2, sub;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sub = num1 - num2;
        System.out.println("Sub of these numbers: "+sub);
    }


}
