package stringprogram;

import java.util.Scanner;

public class CompareTwoString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String firstString = scan.next();
        System.out.println("Enter startIndex");
        String secondString = scan.next();
        int status = firstString.compareTo(secondString);
        if (status>0){
            System.out.println("first string is Greater ");
        } else if (status<0) {
            System.out.println("first string is smaller ");
        }
        else {
            System.out.println("Both are equal ");
        }
    }
}
