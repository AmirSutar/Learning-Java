package BasicPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String name = scanner.nextLine();  // Accepting string input
		//String name = "AbcbA";
		String OriginalName = name;
		String RevName = "";
		
		for(int i = name.length()-1 ; i >= 0 ; i--) {
			RevName = RevName + name.charAt(i);
		}
System.out.println("Reversed String is---> " + RevName);

if(OriginalName.equalsIgnoreCase(RevName)) {
	System.out.println("palindrome");
}
else {

	System.out.println("Not palindrome");
}
	
	}

}
