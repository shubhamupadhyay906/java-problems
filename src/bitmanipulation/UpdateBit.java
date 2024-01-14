package bitmanipulation;

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        //if update is 1 go with set bit operation 
        //if update is 0 go with clear bit operation
        Scanner scanner = new Scanner(System.in);
        int updateBit = scanner.nextInt();
        int pos = 2;
        int n = 5;
        int manipulatedBit = 1 << pos;
        if (updateBit == 1) {
            int updatedBit = manipulatedBit | n;
            System.out.println(updatedBit);
            System.out.println(Integer.toBinaryString(updatedBit));
        } else {
            int negation = ~(manipulatedBit);
            int clearedBit = negation & n;
            System.out.println(clearedBit);
        }
    }
}

//0001<<2=0100
//0100|0101 = 0101
