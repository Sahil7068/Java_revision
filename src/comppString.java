public class comppString {
    public static void main(String[] args) {
        String sakaria = "aaabbbbbcccdd";
        String ans = " " + sakaria.charAt(0);
        int count = 1;
        for (int i =1; i<sakaria.length(); i++){
            char curr = sakaria.charAt(i);
            char pre= sakaria.charAt(i-1);
            if (curr == pre){
                count++;
            }
            else {
                ans = ans + count;
                count=1;
                ans = ans + curr;
            }
        }
        ans = ans + count;
        System.out.println(ans);
    }
}
