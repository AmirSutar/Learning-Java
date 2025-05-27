package Coding_Round;

import java.util.LinkedHashSet;

public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        String input = "giggling";
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            set.add(c);
        }

        StringBuilder output = new StringBuilder();
        for (char c : set) {
            output.append(c);
        }

        System.out.println("After removing duplicates: " + output.toString());
    }
}
