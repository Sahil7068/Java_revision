import java.util.Scanner;

public class primeNunber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for prime number");
        int num = sc.nextInt();
        boolean isnotPrime = false;

        for (int i =2; i<num; i++){
            if (num % i == 0){
                isnotPrime = true;

            }
        }

        if (isnotPrime){
            System.out.println(num + " is not a prime number");
        }
        else {
            System.out.println(num + " is a prime number");
        }
    }
}
