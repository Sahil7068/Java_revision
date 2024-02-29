import java.util.Scanner;

public class grtsmal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter values of array");
        for (int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("The values of array are");
        for (int i =0; i<n; i++) {
            System.out.println(a[i]);
        }

        // 2 4 1 5


        int largest = a[0];
        int smallest = a[0];

        for (int i =1; i<n; i++){
            if(a[i]> largest){
                largest = a[i]; //4
            }

            else  if (a[i]<smallest){
                smallest = a[i];
            }
        }

        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);




    }
}
