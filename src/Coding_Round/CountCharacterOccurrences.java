package Coding_Round;

import java.util.HashMap;

public class CountCharacterOccurrences {
    public static void main(String[] args) {
        String input = "AmRiRaR";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println(map);
    }
}
