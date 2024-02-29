package String;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        boolean isVowel = false;

        for (int i =0; i<str.length(); i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'u'){
                isVowel = true;
                break;
            }


        }

        if (isVowel){
            System.out.println("The string contains vowel");
        }
        else {
            System.out.println("The string does not contains vowel");
        }
    }
}
