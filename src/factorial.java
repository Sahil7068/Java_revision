import java.util.Scanner;

public class factorial {

    public int fac(int num){
        if (num == 0){
            return 1;
        }
        int fact =1;
        for (int i= 1; i<=num; i++){
            fact = fact * i;

        }
        return fact;

    }

    public static void main(String[] args) {
        factorial io = new factorial();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check the factorial");
        int n = sc.nextInt();
        int ft = io.fac(n);
        System.out.println("The factorial is " + ft);





    }
}
