package collections;

import java.util.*;

public class CollectionsGPTLearning {

    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(1, 5, 3, 5, 3, 7); //1, 5, 3, 9, 5, 3, 7, 7, 3, 1, 1);
        System.out.println(remDuplicates(list));

    }

    //Find the second largest element without using sorting.
    public static int secLargest(List<Integer> list) {
        Integer largest = Integer.MIN_VALUE;
        Integer secLargest = Integer.MIN_VALUE;

        for (Integer num: list) {
            if (num > largest) {
                secLargest = largest;
                largest = num;
            } else if (num > secLargest && num != largest) {
                secLargest = num;
            }
        }
        return secLargest;
    }

    //Return top 2 most frequent elements.
    public static List<Integer> twoMostFreq(List<Integer> list) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (Integer number: list) {
            freqMap.put(number, freqMap.getOrDefault(number, 0) + 1);
        }

        Integer first = null;
        Integer second = null;

        int firstFreq = 0;
        int secFreq = 0;

        for (Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > firstFreq ) {
                secFreq = firstFreq;
                firstFreq = freq;

                second = first;
                first = num;
            } else if (freq > secFreq) {
                secFreq = freq;
                second = num;
            }
        }

        return Arrays.asList(first, second);
    }

    //Remove duplicates from a List while preserving insertion order.
    public static ArrayList<Integer> remDuplicates(List<Integer> list) {
//        ArrayList<Integer> distinctList = new ArrayList<>();
//        for (Integer num: list) {
//            if (!distinctList.contains(num)) {
//                distinctList.add(num);
//            }
//        }
//        return distinctList;
        //OR

        return new ArrayList<>(new LinkedHashSet<>(list));
    }
}
