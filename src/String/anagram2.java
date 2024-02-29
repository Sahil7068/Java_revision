package String;

import java.util.Arrays;
import java.util.Scanner;

public class anagram2 {

    public static boolean isAna(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }

        char c1[] = s1.toLowerCase().toCharArray();
        char c2[] = s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.equals(c1, c2)){
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings to check for anagram");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(isAna(s1, s2));

    }
}
