package stringprogram;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Character.isDigit;
import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

public class SumOfAllDigitsPresentInString {

    private static final Logger logger = Logger.getLogger(SumOfAllDigitsPresentInString.class.getName());
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String ");
        String string = scanner.next();
        int sum = 0;
        for (int i = 0; i <= string.length() - 1; i++) {
            char character = string.charAt(i);
            if (isDigit(character)) {
                sum = sum + parseInt(valueOf(character));
            }
        }
        System.out.println(sum);
        logger.info("sum of digits in a string"+ sum);
    }
}
