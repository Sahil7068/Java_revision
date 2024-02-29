package String;

public class compressString {
    public static void main(String[] args) {
        String str = "aaabbbbcccccddd";
        String ans = "" + str.charAt(0);
        int count = 1;

        for(int i =1; i<str.length(); i++){
            char curr = str.charAt(i);
            char pre = str.charAt(i-1);
            if (curr == pre){
                count ++;
            }
            else {
                ans = ans + count;
                count = 1;
                ans = ans + curr;
            }


        }
        ans = ans + count;
        System.out.println(ans);

    }
}
