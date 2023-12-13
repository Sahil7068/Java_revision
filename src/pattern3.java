import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row");
        int r = sc.nextInt();
        System.out.println("Enter a column");
        int c = sc.nextInt();
        for (int i =1; i<=r; i++){
            for (int j =1; j<=c; j++){
                if (j>=i && j<=6-i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
