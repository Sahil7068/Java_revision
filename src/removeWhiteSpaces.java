import java.util.Scanner;

public class removeWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        System.out.println(str.trim());
        System.out.println(str.replaceAll("\\s+", ""));


    }
}
