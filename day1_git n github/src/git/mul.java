package git;

import java.util.Scanner;

public class mul {
public static void main(String[] args) {
        
        int num1, num2, mul;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        mul = num1 * num2;
        System.out.println("mul of these numbers: "+mul);
    }

}
