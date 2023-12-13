package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class arraylist3Methods {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        a.add("java");
        a.add("python");
        a.add("ruby");

        ArrayList<String> b = new ArrayList<>();
        b.add("sdet");
        b.add("devops");
        b.add("pm");
//
//        a.addAll(b);
//        System.out.println(a);

        ArrayList<String> cl = (ArrayList<String>)a.clone();
        System.out.println(cl);

        ArrayList<Integer> in = new ArrayList<>();
        in.add(1);
        in.add(2);
        in.add(3);
        in.add(4);
        in.add(5);
        in.add(6);

        in.removeIf(num -> num%2 == 0);
        System.out.println(in);

        in.removeIf(num -> num%2!=0);
        System.out.println(in);

        // converting to array

        ArrayList<String> arr = new ArrayList<>();
        arr.add("new");
       arr.add("car");
        arr.add("phil");
        arr.add("foden");
        arr.add("vv");
        arr.add("kll");

        Object aaa[] = arr.toArray();
        System.out.println(Arrays.toString(aaa));

        for(Object o : aaa){
            System.out.println(o);
        }



    }
}
