import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not");
        int n = sc.nextInt();
        boolean is_prime = false;

        for (int i =2; i<n; i++){
            if (n % i == 0){
                is_prime = true;
                break;
            }
        }
        if (is_prime == false){
            System.out.println(n + " is a prime number");
        }
        else
            System.out.println(n + " is not a prime number");
    }
}
