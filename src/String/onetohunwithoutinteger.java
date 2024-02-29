package String;

import java.lang.ref.SoftReference;

public class onetohunwithoutinteger {
    public static void main(String[] args) {
        int one = 'A' / 'A';
        String str = "..........";

        for (int i = one; i<=(str.length() * str.length()); i++){
            System.out.println(i);
        }
    }
}
