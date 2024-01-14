package stringprogram;

import java.util.Scanner;

public class VowelCountUsingSingleVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String string = scanner.next();
        String vowels = "aeiou";
        for (int i=0;i<=vowels.length()-1;i++){
            char vowelChar = vowels.charAt(i);
            int count = 0;
            for (int j=0;j<=string.length()-1;j++){
                char character = string.charAt(j);
                if(vowelChar==character){
                    count++;
                }
            }
            System.out.println(vowelChar+": "+count);
        }
    }
}
