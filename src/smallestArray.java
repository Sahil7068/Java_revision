import java.util.Arrays;
import java.util.Scanner;

public class smallestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int small =0;
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter the values of array");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The values of array are ");
        for (int i =0; i<n; i++){
            System.out.println(a[i]);
        }

//        Arrays.sort(a);
//
//        System.out.println(a[0]);

        // without sorting

        for (int i=0; i<n; i++){
            if (a[i] > small){
                small = a[i];
            }
        }

        for (int i =0; i<n; i++){

        }

    }
}
