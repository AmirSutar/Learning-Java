package Coding_Round;

import java.util.HashMap;

public class CountCharacterFrequency {
    public static void main(String[] args) {
        String input = "Amriiirrrrr";
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(freqMap);
    }
}
