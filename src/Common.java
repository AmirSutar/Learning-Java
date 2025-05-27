public class Common {
    public static void main(String[] args) {
        String input = "ddr344Hh 989";
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                a.append(c);
            } else if (Character.isDigit(c)) {
                b.append(c);
            }
        }

        System.out.println("a -> " + a); // ddrHh
        System.out.println("b -> " + b); // 344989
    }
}
