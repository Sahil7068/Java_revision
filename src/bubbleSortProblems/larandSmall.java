package bubbleSortProblems;

public class larandSmall {
    public static void main(String[] args) {
        int a[] = {2, 8, 9, 5, 6, 1};
        int n = a.length;

        for (int i =0; i<n-1; i++){
            for (int j =0; j<n-i-1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
        for (int i =0; i<n;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

//        System.out.println("The smallest number is " + a[0] + " and the largest number " + a[n-1]);
        System.out.println("The second largest number is " + a[n-2]);
    }
}
