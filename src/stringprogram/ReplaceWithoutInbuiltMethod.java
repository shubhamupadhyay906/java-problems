package stringprogram;

import java.util.Scanner;

public class ReplaceWithoutInbuiltMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter string");
        String string = scanner.nextLine();
        System.out.println("enter existing word");
        String ew = scanner.next();
        System.out.println("enter new word");
        String nw = scanner.next();
        String[] newArray = string.split(" ");
        for (int i = 0; i <= newArray.length - 1; i++) {
            if (ew.equals(newArray[i])) {
                newArray[i] = nw;
            }
        }
        for (String nA : newArray) {
            System.out.print(nA+ " ");
        }
    }
}
