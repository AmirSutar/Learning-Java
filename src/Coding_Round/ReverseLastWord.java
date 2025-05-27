package Coding_Round;
public class ReverseLastWord {
    public static void main(String[] args) {
        String input = "I am Amir";
        System.out.println("Modified: " + reverseLastWord(input));
    }

    public static String reverseLastWord(String input) {
        int lastSpace = input.lastIndexOf(" ");
        String firstPart = input.substring(0, lastSpace + 1);
        String lastWord = input.substring(lastSpace + 1);
        return firstPart + new StringBuilder(lastWord).reverse().toString();
    }
}