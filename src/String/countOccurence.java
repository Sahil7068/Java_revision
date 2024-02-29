package String;

import java.util.HashMap;

public class countOccurence {

    public static void getCount(String str){
        HashMap<Character, Integer> charMap = new HashMap<>();
        char ch[]=str.toCharArray();

        for (char c : ch){

            if (charMap.containsKey(c)){
                charMap.put(c, charMap.get(c) + 1);
            }
            else {
                charMap.put(c, 1);
            }

        }
        System.out.println(str + " : " + charMap);



    }
    public static void main(String[] args) {
        getCount("sahils");

    }
}
