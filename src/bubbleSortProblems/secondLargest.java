package bubbleSortProblems;

public class secondLargest {
    public static void main(String[] args) {
        int a[] = {4, 2, 5, 8 ,9};

        int n = a.length;
        for (int i =0; i<n; i++){
            for (int j =0; j<n-i-1; j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
        for (int c : a){
            System.out.print(c + " ");
        }
        System.out.println();
        int secondLar = a[n-2];
        System.out.println("The second largest element is " + secondLar);
    }
}
