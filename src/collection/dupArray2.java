package collection;

import java.util.HashSet;
import java.util.Set;

public class dupArray2 {
    public static void main(String[] args) {
        String str[] = {"class", "object", "neutral", "object"};

        Set<String> s = new HashSet<>();
        for (int i =0; i< str.length; i++){
            String k = str[i];
            if (s.add(k) == false){
                System.out.println("The duplicate string is " + k);
            }
        }
    }
}
