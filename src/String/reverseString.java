package String;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev ="";
        System.out.println("Enter the string to reverse");
        String name = sc.nextLine();

        for (int i =name.length() - 1; i>=0; i--){
            rev = rev + name.charAt(i);

        }

        System.out.println("The reversed string is " + rev);

    }
}
