package PackageA;

import java.util.Scanner;

public class ClassA2 {
	public static void main(String[] args) {

		ClassA2 Fibonacci = new ClassA2();
		
		Fibonacci.Fibo();
		
	

	}

	public void Fibo() {
		System.out.println("Enter final number : ");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int a = 0, b = 1;
		System.out.println("here is your series : " );
		for (int i = 0; i < count; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}

	}
}
