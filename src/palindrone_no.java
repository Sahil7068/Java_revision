import java.util.Scanner;

public class palindrone_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for palindrome");
        int n = sc.nextInt();
        int add = 0;
        int rem;
        int x = n;

        while(x!=0){
            rem = x % 10;
            add = add * 10 + rem;
            x = x/10;

        }

        if (add == n)
            System.out.println(n + " is a palindrome number");
        else
            System.out.println(n + " is not a palindrome number");
    }
}
