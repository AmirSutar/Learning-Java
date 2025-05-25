package BasicPrograms;

import java.util.Scanner;	

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reversed = 0;

		while (num != 0) {
			int Digit = num % 10;
			reversed = reversed * 10 + Digit;
			num = num / 10;
		}
		System.out.println("Revrsed number is = " + reversed);
	}

}
