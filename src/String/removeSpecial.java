package String;

import java.util.Scanner;

public class removeSpecial {

    public static String charac(String str){
        String cha = str.replaceAll("[!@]", "");
        return cha;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println(charac(str));

    }
}
