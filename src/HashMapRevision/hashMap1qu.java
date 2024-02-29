package HashMapRevision;

import java.util.HashMap;
import java.util.Map;

public class hashMap1qu {
    public static void main(String[] args) {

        Map<Character, Integer> input = new HashMap<>();
        input.put('A', 3);
        input.put('B', 3);
        input.put('C', 3);
        input.put('S', 1);
        input.put('R', 1);
        input.put('Y', 1);
        input.put('U', 1);


        Map<Integer, String> output = transformMap(input);

        System.out.println(output);
    }

    private static Map<Integer, String> transformMap(Map<Character, Integer> input) {
        Map<Integer, StringBuilder> resultMap = new HashMap<>();


        for (Map.Entry<Character, Integer> entry : input.entrySet()) {
            char key = entry.getKey();
            int value = entry.getValue();

            // Append the character to the corresponding StringBuilder in the resultMap
            resultMap.computeIfAbsent(value, k -> new StringBuilder()).append(key);
        }

        // Convert StringBuilder to String in the resultMap
        Map<Integer, String> output = new HashMap<>();
        for (Map.Entry<Integer, StringBuilder> entry : resultMap.entrySet()) {
            output.put(entry.getKey(), entry.getValue().toString());
        }

        return output;
    }
}
