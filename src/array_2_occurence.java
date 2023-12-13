import java.util.Scanner;

public class array_2_occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int count =0;
        int a[] = new int[n];

        System.out.println("Enter the values of array");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The array is ");
        for (int i =0; i<n; i++){
            System.out.println(a[i]);
        }

        for (int i =0; i<n; i++){
            for (int j =1; j<n; j++){
                if (a[i] == a[j]){
                    count ++;
                }
            }
            break;
        }
        System.out.println("The occurrence of 1 is " + count);
    }
}
