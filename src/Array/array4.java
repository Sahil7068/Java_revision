package Array;

import java.util.Scanner;

public class array4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the values of array");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The array is ");
        for (int i =0; i<n; i++){
            System.out.println(a[i]);
        }

        System.out.println("The reverse array is ");
//        String rev = "";
//
//        for (int i =a.length-1; i>=0; i--){
//            rev = rev + a[i];
//        }
//
//        System.out.println(rev);

        int j =0;

        int[] ans = new int[n];

        for (int i = n-1; i>=0; i--){
            ans[j++] =a[i];
        }

        for (int i =0; i<n; i++){
            System.out.println(ans[i]);
        }

    }
}
