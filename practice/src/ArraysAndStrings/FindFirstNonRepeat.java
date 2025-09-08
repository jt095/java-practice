package ArraysAndStrings;

public class FindFirstNonRepeat {
    public static void main(String[] args) {
        String testString = "aabbccddeeffgghiijjkkllmmnnoo";
        for (int i = 0; i < testString.length(); i++) {
            if (i > 0 && i < testString.length() - 2) {
                if (testString.charAt(i) != testString.charAt(i-1) && testString.charAt(i) != testString.charAt(i+1)) {
                    System.out.printf("First non-repeat is at index %d for the character %s", i, testString.charAt(i));
                    break;
                }
            }
        }
    }
}
