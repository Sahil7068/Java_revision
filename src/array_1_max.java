import java.util.Scanner;

public class array_1_max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int max = 0;
        int a[] = new int[n];

        System.out.println("Enter the values of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < n; i++) {

            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println("The maximum value in the array is " + max);
    }
}
