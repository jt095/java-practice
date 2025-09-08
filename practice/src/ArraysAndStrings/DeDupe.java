package ArraysAndStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DeDupe {
    public static void main(String[] args) {
        String[] test = new String[]{"a","b","c","a"};
        Set<String> outArray = new HashSet<>(Arrays.asList(test));
        System.out.println(outArray);
    }
}
