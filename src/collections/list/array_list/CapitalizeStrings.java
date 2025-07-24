package collections.list.array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.TreeSet;

public class CapitalizeStrings {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();

		al.add("Gangaraju");
		al.add("Pavana");
		al.add("Thejas");
		al.add("Renuka");
		al.add("Yuva");
		al.add("Pavana");
		al.add("Araadhya");

		// Loop and modify each string using .set().
//		ListIterator<String> it = al.listIterator();
//		while (it.hasNext()) {
//			it.set("Name: " + it.next());
//		}

//		al = al.stream().map(a -> "Name: "+ a).collect(Collectors.toList());
		System.out.println(al);

		// Copy all names that start with “A” to a new list.
		List<String> alCopy = new ArrayList<>();
//		for (String s : al) {
//			if (s.charAt(0) == 'A' || s.charAt(0) == 'a') {
//				alCopy.add(s);
//			}
//		}
		
		alCopy = al.stream()
				.filter(a -> a.charAt(0) == 'A' || a.charAt(0) == 'a')
				.collect(Collectors.toList());
//		System.out.println(alCopy);
		
		Set<String> set = new TreeSet<>();
		set = al.stream()
				.collect(Collectors.toSet());
		System.out.println(set);
	}
}
