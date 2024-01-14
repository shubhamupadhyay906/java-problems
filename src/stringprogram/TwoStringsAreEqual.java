package stringprogram;

import java.util.Scanner;

public class TwoStringsAreEqual {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        System.out.println("s1 == s2 ? " + (s1 == s2)); //true
        System.out.println("s1 == s3 ? " + (s1 == s3)); //false
        System.out.println("s1 equals s3 ? " + (s1.equals(s3))); //true
        if ("abc".equals("abc")){
            System.out.println("Two strings are similar");
        }else{
            System.out.println("Not similar");
        }
    }

}
