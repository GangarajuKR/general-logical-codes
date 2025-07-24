package collections.list.array_list;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Arrays;

public class LoopingAndIteration {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<>();
		
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(1);
		al.add(10);
		al.add(2);
		
		
//		for (int i = 0; i < al.size(); i++) {
//			System.out.println(al.get(i));
//			System.out.print(",");
//		}
//		System.out.println("=====================");
//		
//		for (Integer i: al) {
//			System.out.println(i);
//			System.out.print(",");
//		}
//		System.out.println("=====================");
//		al.forEach(System.out::println);
		
		
		
//		int[] al = {1, 2, 2, 3}; 
//		System.out.println(Arrays.stream(al).average());
//		System.out.println(al.stream().mapToInt(a -> a.intValue()).average()); 
		
//		int sum = 0;
//		for (Integer i : al) {
//			sum += i;
//		}
//		
//		System.out.println(sum/al.size());
		
		//Reverse Printing
		ListIterator<Integer> iterator = al.listIterator(3);
		
//		while (iterator.hasPrevious()) {
//			System.out.println(iterator.previous());
//		}
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
