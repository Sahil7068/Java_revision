package String;

import java.util.HashMap;
import java.util.Scanner;

public class occofchar {

    public static void ocr(String str){
        HashMap<Character, Integer> cc = new HashMap<>();
        char ch[] = str.toCharArray();

        for (char c : ch){
            if (cc.containsKey(c)){
                cc.put(c, cc.get(c) + 1);
            }
            else {
                cc.put(c, 1);
            }
        }
        System.out.println(str + " : " + cc);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        ocr(str);
    }
}
