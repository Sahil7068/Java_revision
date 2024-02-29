import java.util.Scanner;

public class pall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for palindrome");
        int n = sc.nextInt();
        int rem;
        int add = 0;
        int s = n;

        while (s!=0){
            rem = s % 10;
            add = add * 10 + rem;
            s = s/10;
        }
        if (n == add){
            System.out.println(n + " is a palindrome number");
        }
        else{
            System.out.println(n + " is not a palindrome number");
        }
    }
}
