package BasicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int original = num; // ----------only this is new compared to revere number
		int reversed = 0;

		while (num != 0) {
			int Digit = num % 10;
			reversed = reversed * 10 + Digit;
			num = num / 10;
		}

		System.out.println(original == reversed ? "Palindrome" : "Not a Palindrome"); // ----------only this is new
																						// compared to revere number

	}

}
