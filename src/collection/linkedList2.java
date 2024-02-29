package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedList2 {
    public static void main(String[] args) {


        //LL is a default class
        // It can be used as list, stack and queue
        //Dynamic
        LinkedList<String> names = new LinkedList<String>();

        names.add("Tom");
        names.add("sahil");

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        names.add(0, "new");
        System.out.println(names);

        LinkedList<String> users = new LinkedList<String>();
        users.add("great");
        names.addAll(users);
        System.out.println(names);

        System.out.println("----");

        LinkedList<String> lang = new LinkedList<String>();
        lang.add("java");
        lang.add("Python");
        lang.add("ruby");
        lang.add("javascript");

        System.out.println(lang.size());

        //reverse the linkedlist

        Iterator<String> it1 = lang.descendingIterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }




    }
}
