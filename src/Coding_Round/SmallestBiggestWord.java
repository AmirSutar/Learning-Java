package Coding_Round;
public class SmallestBiggestWord {
    public static void main(String[] args) {
        String sentence = "I am Amir";
        findSmallestAndBiggestWord(sentence);
    }

    public static void findSmallestAndBiggestWord(String input) {
        String[] words = input.split(" ");
        String smallest = words[0], biggest = words[0];
        for (String word : words) {
            if (word.length() < smallest.length()) smallest = word;
            if (word.length() > biggest.length()) biggest = word;
        }
        System.out.println("Smallest: " + smallest + ", Biggest: " + biggest);
    }
}