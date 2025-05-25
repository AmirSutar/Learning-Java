package Collection;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//Declaration
		ArrayList mylist = new ArrayList();
		//List mylist = new ArrayList();
		//ArrayList <Integer> mylist = new ArrayList<Integer>();
		
		//Adding data to ArrayList
		mylist.add(100);
		mylist.add(33.5);
		mylist.add("Welcome");
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		mylist.add("This");
		mylist.add("is");
		mylist.add("pune");
		mylist.add("city");
		mylist.add("girl");
		
		
		//Size of arraylist
		
		System.out.println("1. Data of arraylist: "+mylist);
		
		//Remove element from list
		mylist.remove(3);
		System.out.println("2. Data  remmoved from arraylist: "+mylist); 
		
		//Insert element in Arraylist (Adding is diffrent, Adding is one after another, Adding will be done at the end of the list.)
		mylist.add(3, 500);
		System.out.println("3. Data inserted in arraylist: "+mylist); 
		
		//adding element in Arraylist (Adding is diffrent, Adding is one after another, Adding will be done at the end of the list.)
		mylist.add(700);
		System.out.println("4. Data added in arraylist: "+mylist);
		
		//Modification element in Arraylist (Modify/replace/change/edit)
		mylist.set(2, "Tata-bye-bye");
		System.out.println("5. Data replaced in arraylist: "+mylist);
		
		//Access secific element
		System.out.println("6. Access secific element: "+mylist.get(3));
		
		//Size of array
		System.out.println("7. Size of array: "+mylist.size());
		
		//Read data from Arraylist
		//1.  Normal 'For loop'
		//2. Using iterator-important
		
		//------------1-----------------
		for(int i=0 ; i<mylist.size(); i++)
		{
			System.out.print(" "+ mylist.get(i));
			
		}
		
		System.out.println();
				
		//------------2-----------------
		Iterator it = mylist.iterator();
		
		while (it.hasNext())
		{
			System.out.print(" "+ it.next());
		}
		
		System.out.println();
		
		//Is array Empty..?
		System.out.println("10. Is array empty? --> " + mylist.isEmpty());
		
		//remove single element frm array
		mylist.remove(9);
		System.out.println("11. After removing Only 1: "+ mylist);
		
		//Remove multipe values from Array
		///
		
		ArrayList mylist2 = new ArrayList();
		mylist2.add(33.5);
		mylist2.add(100);
		mylist2.add(null);
		mylist2.add("This");
		mylist2.add("is");
		mylist2.add("mumbai");
		mylist2.add("city");
		mylist2.add("bro");
		
			mylist.removeAll(mylist2);
		System.out.println("12. Updated Array : " + mylist );
		
		System.out.println("13. reversed Array :" +mylist.reversed());
		

				
		System.out.println("14. Data of arraylist-1: "+mylist);
		System.out.println("15. Data of arraylist-2 "+mylist2);
		
	
		
		
		//System.out.println("common Array :" + common);
		

		
	
		
		

	}

}
