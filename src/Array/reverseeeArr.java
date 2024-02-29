package Array;

import java.util.Scanner;

public class reverseeeArr {
    public static int[] revvv(int a[]){
        int n = a.length;

        int ans [] = new int[n];
        int j =0;
         for (int i=n-1; i>=0; i--){
             ans[j++] = a[i];
         }
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the " + n + " elemets");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The array is ");
        for (int c : a){
            System.out.print(c + " ");
        }
        System.out.println();

        int ans[] = revvv(a);

        System.out.println("The reversed array is ");
        for (int d : ans){
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
