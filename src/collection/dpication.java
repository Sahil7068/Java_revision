package collection;

import java.util.HashSet;
import java.util.Set;

public class dpication {
//    public static void main(String[] args) {
//        String str[] = {"sahil", "java", "sdet", "new", "sdet"};
//
//        for (int i =0; i< str.length; i++){
//            for (int j = i+1; j< str.length; j++){
//                if (str[i].equals(str[j])){
//                    System.out.println("The duplicate element is " + str[i]);
//                }
//
//            }
//        }
//    }

//    public static void main(String[] args) {
//        String str[] = {"sahil", "java", "sdet", "new", "sdet"};
//
//        Set<String> s = new HashSet<>();
//        for (int i = 0; i < str.length; i++) {
//            String k = str[i];
//            if (s.add(k) == false) {
//                System.out.println("The duplicate elements is " + k);
//            }
//        }
//    }

//    public static void main(String[] args) {
//        String str[]= {"sahil", "java", "sdet", "new", "sdet"};
//
//        Set<String> s = new HashSet<>();
//
//        for (String ss : str){
//
//            if (s.add(ss) == false){
//                System.out.println("The duplicate string is " + ss);
//            }
//        }
//    }


    public static void main(String[] args) {
        String str[] = {"new", "old", "mal", "sick", "detox", "detox"};

        Set<String> s = new HashSet<>();
        for (String p : str){
            if (s.add(p) == false){
                System.out.println("The duplicate elemets is " + p);
            }
        }
    }


}
