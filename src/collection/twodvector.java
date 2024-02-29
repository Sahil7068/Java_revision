package collection;

import java.util.Vector;

public class twodvector {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("Java");
        v.add("python");
        v.add("ruby");
        v.add("javaScript");

        Vector osVec = new Vector();
        osVec.add(v);

        for (int i =0; i<v.size(); i++){
            String str = (String) ((Vector)osVec.get(0)).get(i);
            System.out.println(str);
        }


    }
}
