package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		//Declaration
				HashSet mylist = new HashSet();
				//List mylist = new ArrayList();
				//ArrayList <Integer> mylist = new ArrayList<Integer>();
				
				//Adding data to ArrayList
				mylist.add(100);
				mylist.add(33.5);
				mylist.add("Welcome");
				mylist.add(100);
				mylist.add(null);
				mylist.add(null);
				mylist.add('A');
				mylist.add(100);
				mylist.add(91);
				mylist.add(250);
				mylist.add('C');
				
				
				//Size of arraylist				
				System.out.println("Data of arraylist: "+mylist);
				
				mylist.remove('C');
				System.out.println("Data  remmoved from arraylist: "+mylist); 

	}

}
