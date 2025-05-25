package BasicPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {

	public static void main(String[] args) {

		Integer[] arr = {15,54,62,1,6,56,23,4};
		List <Integer> list = Arrays.asList(arr);
		Collections.reverse(list);
		System.out.println(list);
	}

}
