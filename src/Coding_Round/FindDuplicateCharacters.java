package Coding_Round;

import java.util.HashMap;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String input = "Capgemini";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate characters:");
        for (char c : charCountMap.keySet()) {
            if (charCountMap.get(c) > 1) {
                System.out.println(c + " : " + charCountMap.get(c));
            }
        }
    }
}
