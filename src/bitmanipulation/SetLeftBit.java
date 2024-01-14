package bitmanipulation;

public class SetLeftBit {
    public static void main(String[] args) {
        //set the 2nd bit by position=1 of a number n
        int n = 5;//0101
        int pos = 1;
        int bitOperation = 1 << pos;//left shift by pos
        int newBit = bitOperation | n;
        System.out.println(newBit);
    }
}

// n = 5 //0101
// pos = 1 //0001
// bitOperation = 0001<<1 = 0010(2)
// newBit = 0010 | 0101 = 0111(7)
