package Array;

import java.util.Scanner;

public class array6 {

    public static int[] preefix(int a[]){
        int n = a.length;

        int pre[] = new int[n];
        pre[0] = a[0];

        for (int i =1; i<n; i++){
            pre[i] = pre[i-1] + a[i];
        }

        return pre;
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

        int ans[] = preefix(a);

        for (int i =0; i<n; i++){
            System.out.println(ans[i]);
        }
    }
}
