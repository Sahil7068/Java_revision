package Array;

import java.util.Scanner;



public class krotate1 {

    public static int [] ktate(int a[], int k){
        int n = a.length;

        int ans [] = new int[n];

        int j =0;

        for (int i =n-k; i<n; i++){
            ans[j++] = a[i];
        }

        for (int i = 0; i<n-k; i++){
            ans[j++] = a[i];
        }

        return ans;
    }
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
        for (int i =0; i<n; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Enter the value of to rotate");
        int k = sc.nextInt();
        int ans [] = ktate(a, k);

        for (int i=0; i<n; i++){
            System.out.println(ans[i]);
        }


    }
}
