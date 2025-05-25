package BasicPrograms;

public class PalinromeString {

	public static void main(String[] args) {
		String name = "Are you coming gnimoc uoy erA";
		String OriName = name;
		String RevName = "";
		//String OriginalName = name;
		
		for(int i = name.length()-1; i>=0;i--)
		{
			RevName = RevName + name.charAt(i);
			
		}
		System.out.println("Reversed tring is --> " + RevName);
		
		if(RevName.equalsIgnoreCase(OriName))
			System.out.println("String is palindrome");
		else
			System.out.println("String is not palindrome");

	}

}
