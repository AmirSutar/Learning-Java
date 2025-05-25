package PackageB;

public class ClassB2 {

	public static void main(String[] args) {

		System.out.println("B2 Mehod prints only even numbers till 10 =");
		ClassB2 OnlyEven = new ClassB2();
		OnlyEven.DivisibleBy2();

	}

	public void DivisibleBy2() {

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

	}

}
