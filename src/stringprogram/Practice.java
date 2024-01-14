package stringprogram;

public class Practice {
    public static void main(String[] args) {
        int number = 1234;
       // reverseNumber(number);
        int reverse = 0;
        while (number > 0) {
            System.out.print(number % 10);
            number = number / 10;
        }
    }

//    public static void reverseNumber(int number) {
//        if (number < 10) {
//            System.out.println(number);
//        } else {
//            System.out.print(number % 10);
//            reverseNumber(number / 10);
//        }
//    }
}
