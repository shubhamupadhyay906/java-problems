package stringprogram;

import java.util.Scanner;

public class ExtractStringPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scan.nextLine();
        System.out.println("Enter startIndex");
        int startIndex = scan.nextInt();
        System.out.println("Enter endIndex");
        int endIndex = scan.nextInt();
        String newString = string.substring(startIndex, endIndex);
        System.out.println("using substring method "+newString);
        //without using substring
        StringBuilder extractedString = new StringBuilder();
        for (int i=startIndex;i<=endIndex-1;i++){
            extractedString.append(string.charAt(i));
        }
        System.out.println("with out using substring method "+extractedString);
    }
}
