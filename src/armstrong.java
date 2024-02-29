import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for armstrong");
        int num = sc.nextInt();
        int rem = 0;
        int cube = 0;
        int n = num;

        while (n!=0){
            rem = n % 10;
            n = n/ 10;
            cube = cube + (rem*rem*rem);
        }

        if (num == cube){
            System.out.println(num + " is an armstrong number");
        }
        else {
            System.out.println(num + " is not an armstromg number");
        }
    }
}
