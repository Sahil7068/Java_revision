import java.util.HashMap;

public class OccurrenceofEachCharString {

    public static void getChar(String name){
        HashMap<Character, Integer> cm = new HashMap<>();

        char strArr[] = name.toCharArray();

        for (char c : strArr){

            if (cm.containsKey(c)){
                cm.put(c, cm.get(c) + 1);
            }
            else {
                cm.put(c, 1);
            }


        }
        System.out.println(name + " : " + cm);




    }
    public static void main(String[] args) {
        getChar("test");



    }
}
