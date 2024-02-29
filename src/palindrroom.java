import java.util.Scanner;

public class palindrroom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for palindrome");
        int num = sc.nextInt();
        int rem = 0;
        int add = 0;
        int n = num;
        
        while (n!=0){
            rem = n % 10;
            add = add * 10 + rem;
            n = n /10;
        }

        if (num == add){
            System.out.println(num + " is a plaindrome number");
        }
        else {
            System.out.println(num + " is not a plaindrome number");
        }
    }
}
