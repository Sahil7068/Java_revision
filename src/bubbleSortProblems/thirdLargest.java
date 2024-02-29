package bubbleSortProblems;

import java.util.Scanner;

public class thirdLargest {

    public static int bubbleSoort(int a[]) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
        for (int i =0; i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        return a[n-3];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an aaray");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the " + n + " elements");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The array is ");
        for (int i =0; i<n; i++){
            System.out.print(a[i]);
        }
        System.out.println();

        System.out.println("The third largest elements is " + bubbleSoort(a));
    }
}
