import java.util.Scanner;

public class reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int n = sc.nextInt();
        int add = 0;
        int rem;

        while (n!=0){
            rem = n%10;
            add = add *10 + rem;
            n = n/10;
        }
        System.out.println(add);
    }
}
