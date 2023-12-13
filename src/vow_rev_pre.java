import java.util.Scanner;

public class vow_rev_pre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  string and check if there is any vowel or not");
        String name = sc.nextLine();
        String nn = name.toLowerCase();
        boolean is_vowel = false;
        for (int i =0; i<nn.length(); i++){
            if (nn.charAt(i) == 'a'|| nn.charAt(i) == 'e' || nn.charAt(i) == 'i' || nn.charAt(i) == 'o' || nn.charAt(i) == 'u'){
                is_vowel = true;
                break;
            }

        }
        if (is_vowel){
            System.out.println(nn + " has vowels in it");
        }
        else {
            System.out.println(nn + " does not have vowels in it");
        }
    }
}
