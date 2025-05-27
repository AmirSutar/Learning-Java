package Coding_Round;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String input = "I am Amir";
        String[] words = input.split(" ");
        if (words.length >= 2) {
            words[1] = new StringBuilder(words[1]).reverse().toString();
        }
        System.out.println(String.join(" ", words));
    }
}
