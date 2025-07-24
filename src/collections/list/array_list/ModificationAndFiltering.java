package collections.list.array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ModificationAndFiltering {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(10);
		al.add(2);
		al.add(9);
		
		System.out.println(al.stream().filter(q -> q % 2 != 0).collect(Collectors.toList()));
		
		al.removeIf(a -> a % 2 == 0);
		
//		ListIterator<Integer> it = al.listIterator();
		
//		while(it.hasNext()) {
//			if (it.next() % 2 == 0) {
//				it.remove();
//			}
//		}
		
		System.out.println(al);
	}
}
