package collection;

import java.util.HashSet;
import java.util.Set;

public class set1 {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("new");
        hs.add("old");
        hs.add("great");

        System.out.println(hs);

        for (String a: hs){
            System.out.println(a);
        }
    }
}
