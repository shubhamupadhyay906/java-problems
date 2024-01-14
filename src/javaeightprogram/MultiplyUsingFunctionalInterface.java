package javaeightprogram;

public class MultiplyUsingFunctionalInterface {
    public static void main(String[] args) {
        MultipleInterface multipleInterface = (a, b) -> a * b;
        System.out.println(multipleInterface.multiply(8, 2));
    }
}
