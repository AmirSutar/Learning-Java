package Coding_Round;

import java.util.LinkedHashMap;

public class PrintUniqueCharacters {
    public static void main(String[] args) {
        String input = "Hello world";
        input = input.replace(" ", "").toUpperCase();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {
            if (map.get(c) == 1) {
                System.out.print(c + " ");
            }
        }
    }
}
