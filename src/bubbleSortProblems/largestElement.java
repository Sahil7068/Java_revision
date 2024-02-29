package bubbleSortProblems;

public class largestElement {
    public static void main(String[] args) {
        int a[] = {9, 7, 6, 17, 5};
        int n = a.length;

        for (int i =0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (a[j]> a[j+1]){
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1] =  temp;
                }
            }
        }
        for (int c : a){
            System.out.print(c + " ");
        }
        System.out.println();
        int lg = a[n-1]+5;
        System.out.println("The largest number is " + lg);
    }
}
