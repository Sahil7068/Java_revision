package String;

import java.util.Scanner;

public class specialCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the string");
        String str = sc.nextLine();

        for (int i =0; i<str.length(); i++)

        if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
            count ++;
        }

        if (count == 0){
            System.out.println("The string does not contain special character");
        }
        else {
            System.out.println("The string cobtains special character " + count);
        }
    }
}
