package String;

public class stringManipulation {
    public static void main(String[] args) {
        String str = "My name is captain new america";

        //indexOf
        System.out.println(str.indexOf('n'));
        System.out.println(str.indexOf('n', str.indexOf('n')+1));

        // trim and replace

        String str1 = "  hello new";
        System.out.println(str1.trim());
        System.out.println(str1.replace(" ", ""));

        //split
        System.out.println("------ split -----");

        String str2 = "hello-new-world";
        String spl[] = str2.split("-");
        for (int i =0; i<spl.length; i++){
            System.out.print(spl[i]);
        }



    }
}
