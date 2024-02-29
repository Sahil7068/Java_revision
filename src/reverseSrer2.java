import java.util.Scanner;

public class reverseSrer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        char c1[] = str.toCharArray();
        char c2[] = new char[c1.length];

        for (int i =0; i<c1.length; i++){
            if (c1[i] == ' '){
                c2[i] = ' ';
            }
        }

        int j = c2.length -1;
        for (int i =0; i<c1.length; i++){
            if (c1[i]!= ' '){
                if (c2[j] == ' ') {
                    j--;

                }
                c2[j] = c1[i];
                j--;
            }
        }

        System.out.println(String.valueOf(c2));
    }
}
