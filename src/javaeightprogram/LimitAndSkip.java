package javaeightprogram;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkip {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 23, 35, 36, 77, 78, 99);
        list.stream().limit(3).forEach(x -> System.out.print(x + " "));
        System.out.println();
        list.stream().skip(3).forEach(x -> System.out.print(x + " "));
    }
}
