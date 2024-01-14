package javaeightprogram.mapprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Practice {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10);
        int missingSum = list.stream().mapToInt(x -> x).sum();
        int sum = IntStream.range(1, 11).sum();
        System.out.println(sum - missingSum);
    }
}
