package BasicPrograms;

import java.util.Scanner;

public class Fbonacci {

	public static void main(String[] args) {
		System.out.print("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int a = 0;
		int b = 1;
		
		for (int i = 0; i < num; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;

		}
	}

}
