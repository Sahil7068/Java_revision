package HashMapRevision;

import java.util.*;

public class hashMaptoArrayList {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();
        h.put("google", 2000);
        h.put("amazon", 4000);
        h.put("apple", 3000);
        h.put("sony", 1000);

        System.out.println("size is " + h.size());

        Iterator<Map.Entry<String, Integer>> it = h.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Convert hashmap keys into arraylist
        ArrayList<String> cl = new ArrayList<>(h.keySet());

        for (String t : cl){
            System.out.println(t);
        }




        }
    }

