//import java.util.HashMap;
//import java.util.Map;
//
//public class duplicateCharString {
//    public static void main(String[] args) {
//
//    }
//
//    public static void dup(String str){
//
//        if (str == null){
//            System.out.println("Null String");
//            return;
//        }
//
//        if (str.isEmpty()){
//            System.out.println("Empty string");
//        }
//
//        if (str.length() == 1){
//            System.out.println("Single char string");
//            return;
//        }
//
//        char words[] = str.toCharArray();
//        HashMap<Character, Integer> h = new HashMap<>();
//
//        for (Character ch : words){
//            if (h.containsKey(ch)){
//                h.put(ch, h.get(ch) + 1);
//
//            }
//
//            else {
//                h.put(ch, 1);
//            }
//
//            Set< Map.Entry<Character, Integer> entr = h.entrySet();
//
//
//        }
//
//
//    }
//}
