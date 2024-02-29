package String;

import java.util.Arrays;
import java.util.Scanner;

public class anagram3 {

    public static boolean an(String a, String b){
        char c1[] = a.toCharArray();
        char c2[] = b.toCharArray();

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
        System.out.println("Enter the first string");
        String a = sc.nextLine();

        System.out.println("Enter the second string");
        String b = sc.nextLine();

        System.out.println(an(a, b));
    }
}
