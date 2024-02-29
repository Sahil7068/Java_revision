package Array;

import java.util.Scanner;

public class onesandZero {

    public static void one(int a[]){
        int n = a.length;
        int count = 0;

        for (int i =0; i<n; i++){
            if (a[i] == 1){
                count++;
            }
        }

        for (int i =0; i<n; i++){
            if (i<count){
                a[i] = 1;
            }
            else {
                a[i] = 0;
            }

        }


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
            System.out.print(a[i] + " ");
        }
        System.out.println();

        one(a);

        for (int i =0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
