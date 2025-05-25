package BasicPrograms;

import java.util.Scanner;

public class PrintEvenNumbers {

	public static void main(String[] args) {

		System.out.println("Even number till :  ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
