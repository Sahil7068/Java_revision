import java.util.Scanner;

public class string_palin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rev ="";
        System.out.println("Enter a string");
        String name = sc.nextLine();
        for (int i = name.length() -1; i>=0; i--){
            rev = rev + name.charAt(i);

        }
        if (name.equalsIgnoreCase(rev)){
            System.out.println(name + " is a palindrome string");
        }
        else {
            System.out.println(name + " is not a palindrome string");
        }

    }
}
