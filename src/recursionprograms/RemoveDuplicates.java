package recursionprograms;

public class RemoveDuplicates {
    public static String newString = "";

    public static void main(String[] args) {
        String str = "abbccd";
        System.out.println(removeDupLicates(str, 0));
    }

    private static String removeDupLicates(String str, int index) {
        if (index == str.length()) {
            return newString;
        }
        int ind = newString.indexOf(str.charAt(index));
        if (ind == -1) {
            newString = newString + str.charAt(index);
            return removeDupLicates(str, index + 1);
        }
        return removeDupLicates(str, index + 1);
    }
}
