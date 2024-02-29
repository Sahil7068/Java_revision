package Array;


import java.util.LinkedHashSet;

class HelloWorld {
        public static void main(String[] args) {
            String string = "Hello, World This is a basic string";

            char ch[] = string.toCharArray();
            LinkedHashSet<Character> l = new LinkedHashSet<Character>();

            for (char c : ch){
                l.add(c);
            }

            String str ="";
            for (char cb : l){
                str = str+cb;
            }


            System.out.println(str);

        }
    }

