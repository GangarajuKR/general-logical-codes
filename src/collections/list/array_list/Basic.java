package collections.list.array_list;

import java.util.List;
import java.util.ArrayList;

public class Basic {

	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		//Create an ArrayList<String> of fruits and print each item.
//		al.add("Banana");
//		al.add("Apple");
//		al.add("Orange");
//		al.add("Papaya");
//		
//		for (String st: al) {
//			System.out.println(st);
//		}
		
		//Add 5 student names to an ArrayList, then remove one by name and index.
		//Check if a given name exists in the list using .contains().
		//Replace the 2nd element with a new name using .set() and retrieve it using .get().
		//Print size of the list and check if it’s empty using .isEmpty().

		al.add("Gangaraju");
		al.add("Pavana");
		al.add("Thejas");
		al.add("Renuka");
		al.add("Yuva");
		al.add("Pavana");
		
		//====================
		System.out.println(al); //[Gangaraju, Pavana, Thejas, Renuka, Yuva, Pavana]
		al.remove("Pavana");
		System.out.println(al); //[Gangaraju, Thejas, Renuka, Yuva, Pavana]
		al.remove(3);
		System.out.println(al); //[Gangaraju, Thejas, Renuka, Pavana]
		
		//=========================
		System.out.println(al.contains("Gangaraju")); //true
		System.out.println(al.contains("Raju")); //false
		al.set(1, "Thejas Y");
		System.out.println(al.get(1)); // Thejas Y
		
		//===============================
		System.out.println(al.size()); // 4
		System.out.println(al.isEmpty()); //false
		
		
		//Print all numbers in an ArrayList<Integer> using a for loop, for-each, and .forEach() method.

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			System.out.println("For loop");
		}


	}
}
