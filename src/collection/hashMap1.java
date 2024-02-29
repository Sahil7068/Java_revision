package collection;

import java.util.HashMap;
import java.util.Iterator;

public class hashMap1 {


    //No order - No indexing
    //Key-value pair
    //Key can not be duplicate
    // Can store number of null values but only one null key

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("India", "Delhi");
        map.put("US", "DC");
//
//        System.out.println(map.get("India"));

        // Traversing

        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()){
//            System.out.println(it.next());
            String key = it.next();
            String value = map.get(key);
            System.out.print(" Key = " + key + "" + " value = " + value);
        }
    }
}
