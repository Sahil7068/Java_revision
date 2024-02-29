package collection;

import java.util.Arrays;
import java.util.Scanner;



public class secondLargestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int smax = 0;
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("enter the array values");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("The arrays are");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);


        for (int i = n-2; i>=0; i--){
            if (arr[i] > smax){
                smax = arr[i];
            }
        }

        System.out.println("The second largest integer is " + smax);


    }
}
