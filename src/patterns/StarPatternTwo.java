package patterns;

public class StarPatternTwo {
    /* 123
       456
       789*/
    public static void main(String[] args) {
        int temp = 1;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }
    }
}
