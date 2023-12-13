package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist2Iteration {
    public static void main(String[] args) {
        ArrayList<String> aa = new ArrayList<>();
        aa.add("sahil");
        aa.add("raza");
        aa.add("new");

        // for loop

        for (int i =0; i<=aa.size()-1; i++){
            System.out.println(aa.get(i));
        }

        System.out.println("------");

        // lambda
        aa.stream().forEach(ele -> System.out.println(ele));


        System.out.println("------");
        //iterator
        Iterator<String> it = aa.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }

    }
}
