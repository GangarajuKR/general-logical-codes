package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Basics {

    public static void main(String[] args) {
//        int [] arr = {1, 2, 9, 23, 24, 8, 99, 10000};
//        System.out.println(filterEvenNums(arr));

        String [] strArr = {"ravi", "kiran", "anil"};
        System.out.println(convertToUpperCase(strArr));
        countChars(strArr);

    }

    //Filter even numbers
    private static List<Integer> filterEvenNums(int [] arr) {
        return Arrays.stream(arr).boxed().filter(a -> a%2 == 0).toList();
    }

    //Convert strings to uppercase
    private static List<String> convertToUpperCase(String [] arr) {
        return Arrays.stream(arr).map(String::toUpperCase).toList();
    }

    //Find length of each word
    private static void countChars(String[] arr) {
        Arrays.stream(arr).map(String::length).forEach(num -> System.out.print(num + ", "));
    }
}
