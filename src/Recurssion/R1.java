package Recurssion;

import java.util.Scanner;

public class R1 {

//    public  static void pi(int n){
//        if (n == 1){
//            System.out.println(1);
//            return;
//        }
//        pi(n-1);
//        System.out.println(n);
//    }

    // Recursion Factorial

    public static int fact(int n){
        if (n == 0){
            return 1;
        }

        return (n * fact(n-1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
//        pi(n);
        System.out.println(fact(n));
    }
}
