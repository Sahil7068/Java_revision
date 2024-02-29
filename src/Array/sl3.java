package Array;

import java.util.Scanner;

public class sl3 {

    public  static int smax(int a[]){
        int n = a.length;
        int s = Integer.MIN_VALUE;
        for (int i = 0; i<n; i++){
            if (a[i]>s){
                s=a[i];
            }
        }
        return s;


    }

    static int secMax(int a[]){
        int s = smax(a);
        for (int i =0; i<a.length; i++){
            if (a[i] == s){
                a[i] = Integer.MIN_VALUE;
            }

        }

        int sss = smax(a);
        return sss;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the values of array");
        for (int i =0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The array is ");
        for (int i =0; i<n; i++){
            System.out.println(a[i]);
        }

        System.out.println("The second largest number is " + secMax(a));
    }
}
