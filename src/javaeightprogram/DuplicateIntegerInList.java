package javaeightprogram;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateIntegerInList {
    public static void main(String[] args) {
        List<Integer> arrays = Arrays.asList(10, 28, 87, 10, 20, 76, 28, 80, 80, 80);
        TreeSet<Integer> uniqueSet = new TreeSet<>();
        Set<Integer> duplicate = arrays.stream().filter(integer -> !uniqueSet.add(integer))
                .collect(Collectors.toSet());
        System.out.println(uniqueSet);
        System.out.println(duplicate);
        //arrays.stream().distinct().sorted().forEach(System.out::print);
        //using frequency
//        arrays.stream().filter(integer -> Collections.frequency(arrays, integer) > 1)
//                .collect(Collectors.toSet())
//                .forEach(System.out::println);

        Map<Integer, Long> list = arrays.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(list);
        List<Map.Entry<Integer, Long>> list1 = list.entrySet().stream().filter(integer -> integer.getValue() > 1).toList();
        System.out.println(list1);
        list1.stream().map(Map.Entry::getKey).forEach(System.out::println);
    }
}
