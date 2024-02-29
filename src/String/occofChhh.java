package String;

import java.util.HashMap;
import java.util.Scanner;

public class occofChhh {
    public static void och(String name){
        HashMap<Character, Integer> cc = new HashMap<>();
        char ch[] = name.toCharArray();

        for (char c : ch){
            if (cc.containsKey(c)){
                cc.put(c, cc.get(c) + 1);
            }
            else {
                cc.put(c, 1);
            }
        }
        System.out.println(name + " : " + cc);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = sc.nextLine();
        och(name);
    }
}
