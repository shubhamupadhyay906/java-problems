package javaeightprogram;

import java.util.Arrays;
import java.util.List;

public class SecondSmallestElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 8, 3, 1, 1);
        Integer first = list.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .get();
        System.out.println(first);
    }
}
