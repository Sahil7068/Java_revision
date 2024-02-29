package String;

import java.awt.*;
import java.util.Scanner;

public class removeMiddleName {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("Sahil new raza");
//        str.delete(6, 10);
//        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        String [] arr = str.split(" ");
        String res = arr[0]+" " + arr[arr.length-1];
        System.out.println(res);
//        list1 = [sony,lg,samsung];
//        list2 = [bravia1, bravia2, galaxy, tv,fridge]
//
//        String name = str.substring(0, 5) + " " + str.substring(10, 14);
//        System.out.println(name);
    }
}
