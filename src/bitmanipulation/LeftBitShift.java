package bitmanipulation;

public class LeftBitShift {
    public static void main(String[] args) {
        //get 3rd bit by position=2 of a number n.
        int n = 5;//0101
        int pos = 2;
        int bitOperation = 1 << pos;//left shift by pos
        if ((bitOperation & n) == 0) {
            System.out.println("At position " + pos + " bit is 0");
        } else {
            System.out.println("At position " + pos + " bit is 1");
        }
    }
}
