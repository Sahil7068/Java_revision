package Array;

import java.util.Arrays;

public class sortt {
    public static void main(String[] args) {
        int a[] = {5, 7, 8, 9, 24};
        Arrays.sort(a);

        for (int i =0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int lar = a[a.length-1];
        int sec = a[a.length-2];
        System.out.println("The largest element is " + lar + " and the second largest is " + sec);
    }
}
