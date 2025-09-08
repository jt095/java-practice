package Basics;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        printNextNum(0);
    }

    private static void printNextNum(int currentNum) {
        int limit = 9;
        if (currentNum > limit) return;
        int nextNum = currentNum - 1 + currentNum - 2;
        if (nextNum >= 0) {
            System.out.println(nextNum + ",");
        }
        printNextNum(currentNum + 1);
    }
}
