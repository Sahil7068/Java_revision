package HashMapRevision;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashmap1 {
    public static void main(String[] args) {

        HashMap<String, String> h1 = new HashMap<>();
        h1.put("Marvel", "spiderman");
        h1.put("dc", "batman");
        System.out.println(h1.get("dc"));

        Iterator<Map.Entry<String, String>> it = h1.entrySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("----    -----");

        //iterate using for each and lambda
        h1.forEach((k, v) -> System.out.println("key = " + k + " and value " + v));


    }

    //iterate using for each and lambda




}
