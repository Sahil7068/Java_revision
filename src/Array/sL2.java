package Array;

import java.util.Scanner;

public class sL2 {

    public static int secondLr(int a[]) {
        int n = a.length;
        int max = Integer.MIN_VALUE;

        for (int i =0; i<n; i++){
            if (a[i]> max){
                max = a[i];
            }
        }
        return max;
    }

    static int fins(int a[]){
        int max = secondLr(a);

        for (int i =0; i<a.length; i++){
            if (a[i] == max){
                a[i] = Integer.MIN_VALUE;
            }

        }

        int secMax = secondLr(a);
        return secMax;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the value of array");
        for (int i =0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The array is ");
        for (int i =0; i<n; i++){
            System.out.println(a[i]);
        }

        System.out.println(fins(a));
    }
}
