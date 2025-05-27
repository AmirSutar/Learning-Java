package Coding_Round;
public class FirstUniqueChar {
    public static void main(String[] args) {
        String input = "America";
        char result = findFirstUniqueChar(input);
        System.out.println("First unique character: " + result);
    }

    public static char findFirstUniqueChar(String s) {
        java.util.Map<Character, Integer> map = new java.util.LinkedHashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) return c;
        }
        return '_';
    }
}