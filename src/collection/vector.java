package collection;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(12);
        v.add(6);
        v.add(14);
        v.add(8);
        v.add(9);
        v.add(8);
        v.add(22);
        System.out.println(v.get(3));

    }
}
