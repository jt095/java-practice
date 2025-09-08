package ArraysAndStrings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String[] anagrams = new String[]{"test", "sett"};
        String[] nonAnagrams = new String[]{"tests", "sett"};
        System.out.println(testAnagrams(anagrams[0], anagrams[1]));
        System.out.println(testAnagrams(nonAnagrams[0], nonAnagrams[1]));
    }

    private static boolean testAnagrams(String str1, String str2) {
        char[] str1Arr = str1.toCharArray();
        Arrays.sort(str1Arr);
        String str1Sorted = new String(str1Arr);
        char[] str2Arr = str2.toCharArray();
        Arrays.sort(str2Arr);
        String str2Sorted = new String(str2Arr);
        return str1Sorted.equals(str2Sorted);
    }
}
