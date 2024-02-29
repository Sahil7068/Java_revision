package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class dupCharact {
    public static void main(String[] args) {
        String str = "namma";

        char ch[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    System.out.print(ch[i] + " ");
                    break;

                }
            }
        }


    }
}



