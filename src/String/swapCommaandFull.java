package String;

public class swapCommaandFull {
    public static void main(String[] args) {
        String str = "14, 625, 577.8";
        char ch[] = str.toCharArray();

        for (int i =0; i<ch.length; i++){
            if (ch[i] == ','){
                ch[i] = '.';
            }
            else if (ch[i] == '.'){
                ch[i]= ',';
            }
        }

        System.out.println(String.valueOf(ch));
    }
}
