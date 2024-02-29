package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setUnion {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(new Integer[] {1, 3,6}));

        Set<Integer> s2 = new HashSet<>();
        s2.addAll(Arrays.asList(new Integer[] {1, 3,5}));

        Set<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println(union);


        System.out.println("--- Intersection ----");

        Set<Integer> in = new HashSet<>(s1);
        in.retainAll(s2);
        System.out.println(in);


    }
}
