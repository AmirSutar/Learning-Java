package PackageC;

//import java.util.Scanner;

public class ClassC1 {

	public static void main(String[] args) {

		ClassC1 NewRev = new ClassC1();

		NewRev.reversenumber();

	} 

	public void reversenumber() {
		int num = 63245;
		int revnum = 0;
		
	/*----------------User input start---------------------	
		 System.out.println("Enter Number = ");
		 Scanner sc = new Scanner(System.in);
		 num = sc.nextInt();
	----------------User input end---------------------*/		
		
		while (num > 0) {
			int lastDigit = num % 10;
			revnum = revnum * 10 + lastDigit;
			num = num / 10;
		}
		System.out.println("C1 method represents Revrsed number is = " + revnum);

	}

}
