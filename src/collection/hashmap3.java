package collection;

import java.util.*;

public class hashmap3 {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();
        h.put("Google", 1000);
        h.put("Moolya", 600);
        h.put("Zom", 80);

//        System.out.println("The size is " + h.size());

        Iterator<String> it = h.keySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //converting hashmap into arrayList

        List<String> a = new ArrayList<>(h.keySet());
        System.out.println(a);

    }
}
