package Array;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargestNum {

    public static int secondLa(int a[]){
        int n = a.length;
        int max = 0;

        Arrays.sort(a);

        for (int i =0; i<n-1; i++){
            if (a[i]> max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the value of array");
        for (int i =0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The array is ");
        for (int i =0; i<n; i++){
            System.out.println(a[i]);
        }

        System.out.println("The second largest element is " + secondLa(a));

    }
}
