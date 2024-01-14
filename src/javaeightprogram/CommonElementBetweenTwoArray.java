package javaeightprogram;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CommonElementBetweenTwoArray {
    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> arr2 = Arrays.asList(4, 5, 6, 7, 8);
        List<Integer> list = arr1.stream()
                .filter(integer -> arr2.stream().anyMatch(integer1 -> Objects.equals(integer1, integer)))
                .toList();
        System.out.println(list);

    }
}
