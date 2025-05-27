package Coding_Round;
public class CharacterOccurrences {
    public static void main(String[] args) {
        String input = "Hello";
        printCharacterOccurrences(input);
    }

    public static void printCharacterOccurrences(String s) {
        java.util.Map<Character, Integer> map = new java.util.LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (java.util.Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}

/*
H = 1
e = 1
l = 2
o = 1
*/