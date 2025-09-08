package Basics;

public class CountVowels {
    public static void main(String[] args) {
        String testString = "There once was a pirate named billy bob joe bob jeffrey bob junior and he loved goooold.";
        String vowels = "aeiou";
        int numVowels = 0;
        for (int i = 0; i < testString.length(); i++) {
            if (vowels.contains(Character.toString(testString.charAt(i)).toLowerCase())) {
                numVowels ++;
            }
        }
        System.out.println(numVowels);
    }
}
