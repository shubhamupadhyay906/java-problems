package recursionprograms;

public class printKeyboardCombination {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tu", "vwx", "yz"};

    public static void main(String[] args) {
        String number = "2";
        keyBoardCombination(number, 0, "");
    }

    private static void keyBoardCombination(String number, int index, String combination) {
        if (index == number.length()) {
            System.out.println(combination);
            return;
        }
        String mapping = keypad[number.charAt(index) - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            keyBoardCombination(number, index + 1, combination + mapping.charAt(i));
        }
    }
}
