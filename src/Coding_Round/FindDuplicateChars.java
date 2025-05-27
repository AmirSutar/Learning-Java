package Coding_Round;
public class FindDuplicateChars {
    public static void main(String[] args) {
        String input = "Capgemini";
        findDuplicates(input);
    }

    public static void findDuplicates(String s) {
        java.util.Map<Character, Integer> map = new java.util.HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : map.keySet()) {
            if (map.get(c) > 1) {
                System.out.println(c + " = " + map.get(c));
            }
        }
    }
}