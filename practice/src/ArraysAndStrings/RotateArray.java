package ArraysAndStrings;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        String[] test = new String[]{"a","b","c","d","e","f","g","h","i","j","k"};
        String[] rotated = new String[test.length];
        int rotateBy = 4;
        for (int i = 0; i < test.length; i++) {
            int newIndex = i + rotateBy;
            if (newIndex >= test.length) {
                newIndex = newIndex - test.length;
            }
            rotated[newIndex] = test[i];
        }
        System.out.println(Arrays.toString(rotated));
    }
}
