package Array;

import java.util.Scanner;

public class maxArraynum {

    public static int max(int a[]){
        int n = a.length;

        int m = Integer.MIN_VALUE;

        for (int i =0; i<n; i++){
            if (a[i] > m){
                m = a[i];
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the siz of an array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("The " + n + " Elements are ");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The array is ");
        for (int i =0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("The maximum number is " + max(a));
    }
}
