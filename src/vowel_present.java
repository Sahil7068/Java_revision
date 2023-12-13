import java.util.Scanner;

public class vowel_present {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check for vowel");
        String st = sc.nextLine();
        String sk = st.toLowerCase();
        boolean v = false;
        int count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (sk.charAt(i) == 'a' || sk.charAt(i) == 'e' || sk.charAt(i) == 'i' || sk.charAt(i) == 'o' || sk.charAt(i) == 'u') {
//                count++;
//                System.out.println("The vowel is present");
                v = true;

                break;
            }



        }
        if (v){
            System.out.println("The vowel is present");
            
        }
        else 
        System.out.println("The vowel is not present");
//        System.out.println("The occurence of vowel is " + count);

    }
}
