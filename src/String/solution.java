package String;

import java.util.Arrays;
import java.util.Scanner;

public class solution {
        public static boolean isAnagram(String a, String b){
        int s = a.length();
        int c = b.length();

        if (s != c){
            return false;
        }
        else{
            char c1[] = a.toLowerCase().toCharArray();
            char c2[] = b.toLowerCase().toCharArray();

            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1, c2);

        }

    }

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings to check for anangram");
        String a = sc.nextLine();
        String b = sc.nextLine();
            System.out.println(isAnagram(a, b));
    }


}
