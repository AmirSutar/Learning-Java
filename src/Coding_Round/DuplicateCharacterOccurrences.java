package Coding_Round;
public class DuplicateCharacterOccurrences {
    public static void main(String[] args) {
        String input = "All is well if you plan well";
        printDuplicateCharacterOccurrences(input);
    }

    public static void printDuplicateCharacterOccurrences(String s) {
        java.util.Map<Character, Integer> map = new java.util.LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            if (c != ' ')
                map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (java.util.Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
    }
}