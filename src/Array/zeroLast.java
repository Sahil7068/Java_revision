package Array;

import java.util.Scanner;

public class zeroLast {

    public static void zer(int a[]){
        int n = a.length;
        int count = 0;

        for (int i =0; i<n; i++){
            if (a[i] == 0){
                count++;
            }
        }

        for (int i =0; i<n; i++){
            if (count > i){
                a[i] = 0;
            }
            else {
                a[i] = 2;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the " + n + " elements");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The array is ");
        for (int i =0; i<n; i++){
            System.out.print(a[i] + " ");
        }

        System.out.println();


        zer(a);

        for (int i =0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
