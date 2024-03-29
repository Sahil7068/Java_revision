package Array;

import java.util.Scanner;

public class array3Manipulation {

    public static int findUnique(int a[]){
        int n = a.length;
        for (int i =0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if (a[i] == a[j]){
                    a[i] = -1;
                    a[j] = -1;
                }
            }
        }
        int ans = -1;

        for (int i =0; i<n; i++){
            if (a[i]>0){
                ans = a[i];
            }
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
        for (int i =0; i<n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.println("The unique element is " + findUnique(a));

    }
}
