package collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class arraylist4Duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(2);
        i.add(8);
        i.add(5);
        i.add(2);

        //Linked-hashset

        LinkedHashSet<Integer> lk = new LinkedHashSet<>(i);
        ArrayList<Integer> iwithout = new ArrayList<>(lk);
        System.out.println(iwithout);



    }
}
