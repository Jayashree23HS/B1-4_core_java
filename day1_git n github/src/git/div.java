package git;

import java.util.Scanner;

public class div {
public static void main(String[] args) {
        
        int num1, num2, div;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        div = num1 / num2;
        System.out.println("div of these numbers: "+div);
    }
}
