package Array;

import java.util.HashSet;
import java.util.Set;

public class dupel {
    public static void main(String[] args) {
        String str[] = {"new", "con", "new", "stable"};

        Set<String> s = new HashSet<>();

        for (String p : str){
            if (s.add(p) == false){
                System.out.println("The duplicate string is " + p);
            }
        }
    }
}
