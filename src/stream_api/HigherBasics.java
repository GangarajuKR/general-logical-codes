package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class HigherBasics {
    static String[] names = {"Name", "Gangaraju", "Thejas", "PavanaGanga"};
	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 5, 9, 5, 6, 8, 19, 33, 22, 786, 45, 5};
//		System.out.println(filterEvenNumbers(arr));
//		System.out.println(numCount(arr));
toUpperCase();
	}

    //Convert list of names to uppercase.
    public static void toUpperCase() {
        Arrays.stream(names)
                        .map(String::toUpperCase).forEach(name -> System.out.print(name + " "));

//        System.out.print();
    }
	
	//Filter even numbers from an integer array.
	public static List<Integer> filterEvenNumbers(int[] arr) {
		//return type List<Integer>
		return Arrays.stream(arr)
				.filter(a -> a % 2 == 0)
				.boxed()
				.collect(Collectors.toList());
		
//		// return type int[]
//		return Arrays.stream(arr)
//				.filter(a -> a % 2 == 0)
//				.toArray();
	}
	
	//Count how many times each number appears in a list.
	public static Map<Integer, Long> numCount(int[] arr) {
		return Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
}
