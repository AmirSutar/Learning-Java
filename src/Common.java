import java.util.HashSet;

public class Common {

	public static void main(String[] args) {

		String[] Arr1 = { "This", "Is", "It" };
		String[] Arr2 = { "This", "Is", "Its" };

		HashSet<String> mylist = new HashSet<String>();

		for (int i = 0; i < Arr1.length; i++) {
			for (int j = 0; j < Arr2.length; j++) {

				if (Arr1[i] == Arr2[j]) {
					mylist.add(Arr1[i]);
				}

			}

		}

		System.out.println(mylist);

	}

}
