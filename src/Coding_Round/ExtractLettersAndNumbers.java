package Coding_Round;

public class ExtractLettersAndNumbers {
    public static void main(String[] args) {
        String[] input = {"ddr344Hh", "g89"};
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (String str : input) {
            for (char c : str.toCharArray()) {
                if (Character.isLetter(c)) {
                    letters.append(c);
                } else if (Character.isDigit(c)) {
                    numbers.append(c);
                }
            }
        }

        System.out.println("Letters: " + letters.toString());
        System.out.println("Numbers: " + numbers.toString());
    }
}
