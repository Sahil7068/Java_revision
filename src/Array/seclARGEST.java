package Array;

import java.util.Scanner;

public class seclARGEST {

    public static int secll(int a[]){
        int n = a.length;
        int max = Integer.MIN_VALUE;
        for (int i =0; i<n; i++){
            if (a[i]> max){
                max = a[i];
            }
        }
        return max;
    }

    public static int ss(int a[]){
        int n = a.length;
        int max = secll(a);
        for (int i =0; i<n; i++){
            if (a[i] == max){
                a[i] = Integer.MIN_VALUE;
            }
        }

        int l = secll(a);
        return l;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("The " + n + " elements are ");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The array is ");
        for (int i =0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("The second largest number in the array is " + ss(a));
    }
}
