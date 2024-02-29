package Array;

public class seccLargestThirdMin {

    public static void main(String[] args) {
        int a[] = {3, 7, 8, 4, 10, 15};

        int n = a.length;

        for (int i =0; i<n-1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
        for (int c: a){
            System.out.print(c + " ");
        }
        System.out.println();

        int sL = a[n-2];
        int tM = a[2];

        System.out.println("The second largest number is " + sL + " and the third smallest number is " + tM);
    }
}
