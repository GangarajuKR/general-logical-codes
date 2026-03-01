package logical_coading;

import java.util.Arrays;
import java.util.Comparator;

public class FindTheSecondLargest {

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1, 39};

        int a = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println(a);

//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
//        for (int i: arr) {
//            if (i > largest) {
//                secondLargest = largest;
//                largest = i;
//            } else if (i > secondLargest && i != largest) {
//                secondLargest = i;
//            }
//        }
//
//        if (secondLargest == Integer.MIN_VALUE) {
//            System.out.println("Second largest number not fund");
//        } else {
//            System.out.println("Second largest number: "+ secondLargest);
//        }
    }
}
