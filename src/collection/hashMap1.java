package collection;

import java.util.HashMap;

public class hashMap1 {


    //No order - No indexing
    //Key-value pair
    //Key can not be duplicate
    // Can store number of null values but only one null key
    
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("India", "Delhi");
        map.put("US", "DC");

        System.out.println(map.get("India"));
    }
}
