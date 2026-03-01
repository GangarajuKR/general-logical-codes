package stream_api;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

record Employee (int id, String name, long salary) {
    public long getSalary() {
        return this.salary;
    }
}

record Employee1 (String department, String name) {
}

public class    Basics {
//    public static void main(String[] args) {
//        List<Integer> nums = List.of(3, 6, 9,  12,  18);
////        even(nums);
////        squareOdd(nums);
////        max(nums);
////    sum(nums);
//count();
//
//
//
//    }



    //Print even-numbers
    public static void even(List<Integer> nums) {
        nums.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }

    //Print square of odd-numbers
    public static void squareOdd(List<Integer> nums) {
        nums.stream().filter(n -> n % 2 != 0)
                .map(n -> n * n)
                .forEach(System.out::println);
    }

    //Max from the list
    public static void max(List<Integer> nums) {
        nums.stream().max(Integer::compareTo).ifPresent(System.out::print);
    }

    //Sum of elements
    public static void sum(List<Integer> nums) {
        int sum = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

    //Count of elements in each group
    public static void count() {
        List<String> list = List.of("java", "spring", "java");
        Map<String, Long> data= list.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));
        System.out.println(data);
    }

    public static void main(String[] args) {
        List<Integer> nums = List.of(3, 6, 9,  12,  18);
//        toUpperCase();
//        squareEvensNSort();
//        salM50k();
        removeDuplicates();
//        groupEmps();
//        strCounts();
//        concatPrefix();
//        intAbs();

    }

//    public static void () {
//
//    }

    //convert numbers to their absolute values?
    public static void intAbs() {
        List<Integer> nums = List.of(-3, -1, 0, 2, 5);
        nums.stream().map(Math::abs).forEach(System.out::println);
    }

    //Add "Mr. " before each name
    public static void concatPrefix() {
        List<String> names = List.of("John", "Raj");
        names.stream().map(str -> "Mr."+str).forEach(System.out::println);
    }

    //Find the first non-repeating character.
    public static void firstNonRepeatingChar() {
        String input = "swiss";

        Character result = input.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                )).entrySet()
                .stream()
                .filter(c -> c.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(result);

    }

    //Count how many times each word appears.
    public static void strCounts() {
        List<String> words = List.of(
                "java", "spring", "java", "docker", "spring", "java"
        );

        Map<String, Long> result= words.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
        System.out.println(result);
    }

    //Group employees by department.
     public static void groupEmps() {
         List<Employee1> employees = List.of(
                 new Employee1("IT", "Ravi"),
                 new Employee1("HR", "Anita"),
                 new Employee1("IT", "Suresh"),
                 new Employee1("Finance", "Meena"),
                 new Employee1("HR", "Rahul")
         );

         Map<String, List<Employee1>> result = employees.stream().collect(Collectors.groupingBy(
                 Employee1::department
         ));

         result.forEach((key, list) -> {
             System.out.println("\n Department:" + key);
             for(Employee1 emp: list) {
                 System.out.println(emp.name());
             }
         });

//         System.out.println(result);

    }

//    array, remove duplicates and return numbers in descending order.
    public static void removeDuplicates() {
        int[] nums1 = {4, 2, 9, 1, 4, 2, 8, 9};
        int[] nums2 = {22, 23, 78, 67, 97, 23};

        int[] numbers = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, numbers, 0, nums1.length);
        System.arraycopy(nums2, 0, numbers, nums1.length, nums2.length);
//        System.out.println(Arrays.toString(numbers));
        List<Integer> result = Arrays.stream(numbers)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder()).toList();

//        List<Integer> result = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2))
//                .distinct().sorted().boxed().toList();
        System.out.println(result);

    }
    //get employee names who earn more than 50,000, convert names to UPPERCASE, and sort alphabetically.
    public static void salM50k() {
        List<Employee> employees = List.of(
                new Employee(1, "Arjun", 45000),
                new Employee(5, "Gangaraju", 75000),
                new Employee(2, "Bhavya", 75000),
                new Employee(3, "Chirag", 60000),
                new Employee(4, "Deepa", 30000)
        );

        employees.stream().filter( e -> e.getSalary() > 50000)
                .map(e -> e.name().toUpperCase())
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
    //convert all strings to uppercase.
    public static void toUpperCase() {
        List<String> names = List.of("java", "spring", "docker");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }

    //squares of even numbers sorted in descending order
    public static void squareEvensNSort() {
        List<Integer> nums = List.of(3, 4, 6, 7, 9);
        List<Integer> squareEvensNSort = nums.stream().filter(num -> num % 2 == 0)
                .map(num -> num * num).sorted(Comparator.reverseOrder()).toList();
        System.out.println(squareEvensNSort);
    }
}
