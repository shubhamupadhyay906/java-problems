package stringprogram;

import java.util.Scanner;

public class StringCountCharacter {
//    Enter Name
//Developer
//Enter Index
//e
//3
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name ");
        String name = scanner.next();
        System.out.println("Enter Index");
        char char1 = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char char2 = name.charAt(i);
            if (char1 == char2) {
                count++;
            }
        }
        System.out.println(count);
    }
}
