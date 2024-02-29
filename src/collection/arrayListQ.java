package collection;

import java.util.*;

public class arrayListQ {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(3, 4, 5));
//        ArrayList<Integer> c = new ArrayList<>(a);
        Set<Integer> c = new LinkedHashSet<>(a);
        c.addAll(b);
        System.out.println(c);


    }
}
