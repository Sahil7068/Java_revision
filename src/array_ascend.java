import java.util.Scanner;

public class array_ascend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of the array");
        int n = sc.nextInt();
        int temp=0;
        int a[] = new int[n];

        System.out.println("Enter the values of array");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i =0; i<n; i++){
            System.out.print(a[i]);
        }

        for (int i =0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Rearranged array ");
        for (int i =0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
