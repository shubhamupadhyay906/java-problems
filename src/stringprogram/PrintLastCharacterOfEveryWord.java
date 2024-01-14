package stringprogram;

import java.util.Scanner;
import java.util.stream.Stream;

public class PrintLastCharacterOfEveryWord {
    //how are you
    //w e u
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scanner.nextLine();
        Stream<String> split = Stream.of(string.split("\\s+"));
        split.forEach(word->{System.out.println(word.charAt(word.length()-1));});
    }
}
