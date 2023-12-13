import java.util.Scanner;

public class palin_int_revison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to check for palindrome");
        int x = sc.nextInt();
        int add = 0;
        int rem;
        int y =x;

        while(y!=0){
            rem = y%10;
            add = add * 10 + rem;
            y = y/10;
        }

        if (add == x){
            System.out.println(x + " is a palindrome number");
        }
        else {
            System.out.println(x + " is not a palindrome number");
        }
    }
}
