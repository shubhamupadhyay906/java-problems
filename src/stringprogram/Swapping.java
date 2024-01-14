package stringprogram;

public class Swapping {
    public static void main(String[] args) {
        swapWithOutThirdVariable();
        swapUsingThirdVariable();
    }

    private static void swapWithOutThirdVariable() {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1.concat(s2));
        s1 = s1 + s2;//HelloWorld
        s2 = s1.substring(0, s1.length() - s2.length());//Hello
        s1 = s1.substring(s2.length());//World
        System.out.println(s1.concat(s2));
    }

    private static void swapUsingThirdVariable() {
        String s1 = "Hello";
        String s2 = "World";
        System.out.println(s1.concat(s2));
        String temp = s1;
        s1 = s2;
        s2 = temp;
        System.out.println(s1.concat(s2));
    }
}
