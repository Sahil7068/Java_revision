package Array;

import java.util.Scanner;

public class zeroesandOne1 {

    public static void zerr(int a[]){
        int n = a.length;
        int count = 0;

        for (int i =0; i<n; i++){
            if (a[i] == 0){
                count++;
            }
        }

        for (int i =0; i<n; i++){
            if (i < count) {
                a[i] = 0;
            }
            else {
                a[i] = 1;
            }
        }
        for (int i =0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("The " + n + " elements are");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The array is ");
        for (int i =0; i<n; i++){
            System.out.println(a[i] + " ");
        }
        System.out.println();

        zerr(a);


    }
}
