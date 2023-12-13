package collection;

import java.util.ArrayList;
import java.util.Collections;

public class arrayListCompare {
    public static void main(String[] args) {

        // 1. sort and then equals -> comparing two arrayList

        ArrayList<String> a = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("c");

        ArrayList<String> b = new ArrayList<>();
        a.add("a");
        a.add("b");
        a.add("d");

//        Collections.sort(a);
//        Collections.sort(b);
//
//        System.out.println(a.equals(b));

        //compare two list - find out the additional elements

        a.removeAll(b);
        System.out.println(a);

        a.retainAll(b);
        System.out.println(a);




    }
}
