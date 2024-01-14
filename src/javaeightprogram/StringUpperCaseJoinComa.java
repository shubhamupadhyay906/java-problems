package javaeightprogram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCaseJoinComa {
    public static void main(String[] args) {
        List<String> string = Arrays.asList("Hi", "How", "are", "you");
        String collect = string.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
