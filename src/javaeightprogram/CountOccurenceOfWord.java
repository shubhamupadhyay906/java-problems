package javaeightprogram;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfWord {
    public static void main(String[] args) {
        //welcome to code decode and code decode welcome you
        String str = "welcome to code decode and code decode welcome you";
        List<String> strArr = Arrays.asList(str.split(" "));
        Map<String, Long> collect = strArr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        //duplicates
        List<Map.Entry<String, Long>> list = collect.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .toList();
        System.out.println(list);
        //unique
        List<Map.Entry<String, Long>> list1 = collect.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .toList();
        System.out.println(list1);

        List<String> list2 = collect.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        //using frequency duplicate
        System.out.println("using frequency");
        Set<String> list3 = strArr.stream()
                .filter(entry -> Collections.frequency(strArr, entry) > 1)
                .collect(Collectors.toSet());
        System.out.println(list3);

        //using frequency unique
        System.out.println("using frequency");
        Set<String> list4 = strArr.stream()
                .filter(entry -> Collections.frequency(strArr, entry) == 1)
                .collect(Collectors.toSet());
        System.out.println(list4);
    }

    private static void normal(String[] str) {
        for (int i = 0; i <= str.length - 1; i++) {
            int count = 0;
            for (int j = 0; j <= str.length - 1; j++) {
                if (str[i].equals(str[j])) {
                    count++;
                }
            }
            int status = 0;
            for (int k = i; k >= 0; k--) {
                if (str[i].equals(str[k])) {
                    status++;
                }
            }
            if (status == 1 && count >= 2) {
                System.out.println(str[i] + " " + count);
            }
        }
    }
}
