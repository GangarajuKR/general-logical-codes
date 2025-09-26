package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DistinctAndSorting {

    public static void main(String[] args) {
        int [] arr = {5, 3, 7, 3, 2, 5, 9};
//        System.out.println(uniqueSorted(arr));
//        sortAlphabetically();
        reverseNumbers();
    }

    //Unique numbers sorted
    public static List<Integer> uniqueSorted(int[] arr) {
        return Arrays.stream(arr).distinct().sorted().boxed().collect(Collectors.toList());
    }

    //Sort names alphabetically
    public static void sortAlphabetically() {
        String[] starr = {"Ravi", "Anil", "Kiran"};
        Arrays.stream(starr).sorted().forEach(System.out::println);
    }

    //Reverse sort numbers
    public static void reverseNumbers() {
        int[] arr = {10, 3, 7, 1, 11};
        System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toList());
    }
}
