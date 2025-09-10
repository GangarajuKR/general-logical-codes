package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Aggregations {

    public static void main(String[] args) {
        int [] arr = {4, 9, 2, 7, 5};
//        System.out.println(sum(arr));
//        System.out.println(maxNMin(arr));
        String [] strArr = {"hi", "java", "stream", "go", "gangaraju", "ganga"};
        System.out.println(wordsLengthMoreThan3(strArr));
    }


    //Sum of numbers
    public static int sum(int [] arr) {
//        return Arrays.stream(arr).sum();
        List<Integer> list = Arrays.stream(arr).boxed().toList();
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    //Find max and min
    public static OptionalInt maxNMin(int [] arr) {
        System.out.print("MAX: "+ Arrays.stream(arr).max());
        System.out.print("MIN: "+ Arrays.stream(arr).min());

        List<Integer> list = Arrays.stream(arr).boxed().toList();

        System.out.print("MAX: "+ list.stream().mapToInt(Integer::intValue).max());
        System.out.print("MIN: "+ list.stream().mapToInt(Integer::intValue).min());

        return list.stream().mapToInt(Integer::intValue).min();
    }

    //Count words with length > 3
    public static long wordsLengthMoreThan3(String[] arr) {
        return Arrays.stream(arr).filter(str -> str.length() > 3).count();
    }
}
