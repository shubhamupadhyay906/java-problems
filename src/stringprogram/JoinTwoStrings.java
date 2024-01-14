package stringprogram;

public class JoinTwoStrings {
    public static void main(String[] args) {
        String s = "Hello";
        String l = s.concat("world");
        String j = new String("Hello");
        j.concat("world");
        System.out.println(s);
        System.out.println(l);
        System.out.println(j);

    }
}
