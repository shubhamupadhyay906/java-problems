package bitmanipulation;

public class ClearBit {
    public static void main(String[] args) {
        //clear 3rd bit position=2 by a number n.
        int n = 5;
        int pos = 2;
        int bitManipulation = 1 << pos;
        int negationBit = ~(bitManipulation);
        int newBit = negationBit & n;
        System.out.println(newBit);
    }
}

//n=5 //0101
//pos=2 //0010
//bitManipulation 0001<<2 = 0100(4)
//negationBit ~0100 = 1011(11)
//newBit 1011 & 0101 = 0001(1)
