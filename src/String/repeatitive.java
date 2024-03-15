package String;

public class repeatitive {
    public static void main(String[] args) {
        String str = "checeahn";
        char ch[] = str.toCharArray();
        boolean isRepeated;

        for(int i = 0; i < str.length(); i++) {
            isRepeated = false;
            for(int j = 0; j < str.length(); j++) {
                if(i != j && ch[i] == ch[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if(!isRepeated) {
                System.out.println("The first non-repetitive character is: " + ch[i]);
                break;
            }
        }
    }
}
