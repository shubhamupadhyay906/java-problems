package patterns;

public class StarPatternThree {
    public static void main(String[] args) {
        char ch = 65;
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print((char) (ch + i));
                ch++;
            }
            System.out.println();
        }
    }
}
