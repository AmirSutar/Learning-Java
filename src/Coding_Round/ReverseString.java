package Coding_Round;


public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed); // Output: olleH
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
