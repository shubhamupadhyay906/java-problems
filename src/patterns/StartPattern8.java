package patterns;

public class StartPattern8 {
    public static void main(String[] args) {
        //****
        //***
        //**
        //*
        pattern1();
        System.out.println("-----------------------");
        //****
        // ***
        //  **
        //   *
        pattern2();
        System.out.println("-----------------------");
        //   *
        //  **
        // ***
        //****
        pattern3();
    }

    private static void pattern3() {
        int star = 0;
        int space = 4;
        for (int i = 1; i <= 4; i++) {
            star++;
            space--;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern2() {
        int star = 5;
        int space = -1;
        for (int i = 1; i <= 4; i++) {
            star--;
            space++;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void pattern1() {
        int star = 5;
        for (int i = 1; i <= 4; i++) {
            star--;
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
