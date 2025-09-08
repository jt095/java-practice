package Basics;

public class Reverse {
    public static void main(String[] args) {
        String toReverse = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        for(int i = toReverse.length()-1; i >= 0; i--) {
            sb.append(toReverse.charAt(i));
        }
        System.out.println(sb);
    }
}
