package String;

import java.util.Scanner;

public class retainSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        char ch1[] = str.toCharArray();
        char ch2[] = new char[ch1.length];

        for (int i =0; i<ch1.length; i++){
            if (ch1[i] == ' '){
                ch2[i] = ' ';

            }
        }

        int j = ch2.length-1;
        for (int i =0; i<ch1.length; i++){
            if (ch1[i]!=' '){
                if (ch2[j] == ' '){
                    j--;
                }
                ch2[j] = ch1[i];
                j--;
            }

        }

        System.out.println(String.valueOf(ch2));
    }
}


