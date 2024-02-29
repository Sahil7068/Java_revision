package bubbleSortProblems;

public class thirdMin {
    public static void main(String[] args) {
        int a[] = {3, 4, 8, 9, 23, 45};
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
        for (int c: a){
            System.out.print(c + " ");
        }
        System.out.println();
        int thr = a[2];
        int secL = a[n-2];
        System.out.println("The third minimum number is " + thr + " and the second largest number is " + secL);
    }
}
