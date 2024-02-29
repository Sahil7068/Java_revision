package collection;

import java.util.HashMap;
import java.util.HashSet;

public class hashmap2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hh= new HashMap<>();
        hh.put(1, "a");
        hh.put(2, "b");
        hh.put(3, "c");

//        HashMap<String, Integer> hh1= new HashMap<>();
//        hh.put("a", 1);
//        hh.put("c", 3);
//        hh.put("b", 2);

        HashMap<Integer, String> hh1= new HashMap<>();
        hh1.put(1, "a");
        hh1.put(2, "b");
        hh1.put(3, "c");
        hh1.put(4, "d");
        hh1.put(5, "e");

        //combine the keys from the map - >  using Hashset

        HashSet<Integer> ss = new HashSet<>(hh.keySet());

        //add keyset from hh1

        ss.addAll(hh1.keySet());
        ss.removeAll(hh.keySet());




        System.out.println(ss);





    }
}
