package collections.map;

import java.util.*;

public class Basics {

    public static void main(String[] args) {
//        String[] str1 = new String[9];
//        System.out.println(str1[0]);
        String[] str = {"a", "b", "a", "d", "e", "d", "a"};

        List<String> list = Arrays.asList(str);
        Map<String, Integer> freqMap = new HashMap<>();
        for (String string : list) {
            freqMap.put(string, freqMap.getOrDefault(string, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list1 = new ArrayList<>(freqMap.entrySet());

        list1.sort((s1, s2) -> s2.getValue() - s1.getValue() );
        for (int i = 0; i < 2; i++) {
            System.out.println(list1.get(i));
        }


    }
}
