package Coding_Round;

public class LengthOfLargestWord {
    public static void main(String[] args) {
        String input = "my name is suryawanshi";
        String[] words = input.split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
        System.out.println("Length: " + longest.length());
    }
}
