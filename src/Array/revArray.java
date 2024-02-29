package Array;

import java.util.Scanner;

public class revArray {

    public static int[] rev(int a[]){
        int n = a.length;
        int ans [] = new int[n];
        int j =0;

        for (int i =n-1; i>=0; i--){
            ans[j++] = a[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println(" The " + n + " elements are");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The array is");
        for (int i =0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int ans [] = rev(a);

        System.out.println("The reversed array is");
        for (int i =0; i<n ;i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
