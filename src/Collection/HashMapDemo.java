package Collection;

import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String> ();
		hm.put(101, "Amir");
		hm.put(102, "Jaid");
		hm.put(103, "Roshni");
		hm.put(104, "Uwais");
		hm.put(101, "Black");
		hm.put(106, "Uwais");
		
		System.out.println("1. Total array- " +hm);
		
		//Remove pair
		hm.remove(106);
		System.out.println("2. After removing array- " + hm);
		
		//access any element
		System.out.println("3. Access: "+ hm.get(103));
		
		//Get all the keys
		System.out.println("4. all the keys : "+ hm.keySet());
		
		//Get all theValues
		System.out.println("5. all the Valus: "+ hm.values());
		
		//Get all the keys & Values
		System.out.println("6. all the keys & Values: "+ hm.entrySet());
		
		
		
		
		
		
		
		
		
		
		 

	}

}
