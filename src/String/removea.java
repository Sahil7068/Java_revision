package String;

public class removea {
    public static void main(String[] args) {
        String name = "shaiaaala";
        String str = "";

        boolean firstOccurrenceFound = false;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' && !firstOccurrenceFound) {
                firstOccurrenceFound = true;
                str += ch; 
            } else if (ch != 'a' || !firstOccurrenceFound) {
                str += ch;
            }
        }
        System.out.println("Modified String: " + str);
    }
}



