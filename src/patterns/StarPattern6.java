package patterns;

public class StarPattern6 {
    //**        **
    // **      **
    //  **    **
    //   **  **
    //    ****
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 12; j++) {
                if (i == j || (i + j) == 13 || (i + j) == 12 || i + 1 == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
