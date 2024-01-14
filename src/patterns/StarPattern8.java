package patterns;

public class StarPattern8 {
    public static void main(String[] args) {
        //     **
        //    ****
        //   ******
        //  ********
        // **********
        pattern1();
        System.out.println("----------------------");
        //*********
        //  *******
        //   *****
        //    ***
        //     *
        pattern2();
        System.out.println("----------------------");
    }

    private static void pattern2() {
        int star = 11;
        int space = -1;
        for (int i = 1; i <= 5; i++) {
            star = star - 2;
            space++;
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern1() {
        int star = -1;
        int space = 5;
        for (int i = 1; i <= 5; i++) {
            star = star + 2;
            space--;
            for (int j = 0; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
