package BasicPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySmallestHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {155,586,55,44,62,85,6};
		Arrays.sort(arr);
	//	System.out.println(Arrays.toString(arr)); // "Sorted array " + 
		System.out.println(arr[0]);               // "Second lowest " + 
		System.out.println(arr[arr.length-1]);    // ""Second highest "+
		
		ArrayList<Integer> mylist = new ArrayList();
		mylist.add(20);
		mylist.add(66);
		mylist.add(50);
		mylist.add(80);
		mylist.add(10);
		
		mylist.sort(null);
		System.out.println(mylist);
		
		System.out.println (mylist.get(1));
		
	}

}
