package Array;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class zeroesandOne {

    public static void zeroesone(int a[]){
        int n = a.length;
        int zeroes = 0;

        for (int i =0; i<n; i++){
            if (a[i] == 0){
                zeroes++;
            }
        }

        for  (int i =0; i<n; i++){
            if (i < zeroes){
                a[i] = 0;
            }
            else {
                a[i] = 1;
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

        System.out.println("The value of array is ");
        for (int i =0; i<n; i++){
            System.out.println(a[i]);
        }

        zeroesone(a);
        System.out.println("Sorted array");
        for (int i =0; i<n; i++){
            System.out.println(a[i]);
        }

    }
}
