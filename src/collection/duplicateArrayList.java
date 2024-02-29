package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class duplicateArrayList {
    public static void main(String[] args) {
        ArrayList<String> ss = new ArrayList<>(Arrays.asList("spiderman", "superman", "batman", "spiderman"));
        LinkedHashSet<String> iwith = new LinkedHashSet<>(ss);
        ArrayList<String> so = new ArrayList<>(iwith);
        System.out.println("Elements after removing duplocates" + so);
    }
}
