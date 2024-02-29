import java.util.Scanner;

public class primenooo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for prime");
        int n = sc.nextInt();
        boolean is_Prime = true;

        for (int i =2; i<n; i++){
            if (n % 2 == 0){
                is_Prime = false;
                break;
            }
        }
        if (is_Prime == true){
            System.out.println(n + " is a prime number");

        }
        else {
            System.out.println(n + " is not a prime number");
        }
    }
}
