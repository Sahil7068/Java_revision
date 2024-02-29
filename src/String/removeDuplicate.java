package String;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = sc.nextLine();

        LinkedHashSet<Character> s = new LinkedHashSet<>();

        for (int i =0; i<name.length(); i++){
            s.add(name.charAt(i));



        }

        for (char c : s){
            System.out.print(c);

        }
        System.out.println();


    }
}










