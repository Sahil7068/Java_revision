package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class dupplicateElemts {
//    public static void main(String[] args) {
//        String s[] = {"java", "mava", "lava", "java"};
//
//        Set<String> s1 = new HashSet<>();
//
//        for (String k : s){
//            if (s1.add(k) == false){
//                System.out.println("The duplicate element is " + k);
//            }
//
//        }
//    }

    public static void main(String[] args) {
        String str[] = {"java", "mava", "nava", "java"};

        for (int i =0; i< str.length; i++){
            for (int j = i+1; j< str.length; j++){
                if (str[i].equals(str[j])){
                    System.out.println("The duplicate element is " + str[i]);
                }
            }
        }
    }
}
