package Basics;

public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println(getLargest(0, 30, 8));
        System.out.println(getLargest(-30, 10, 0));
        System.out.println(getLargest(100, 2, 678));
    }

    private static int getLargest(int a, int b, int c) {

        if (a > b) {
            if (a > c) return a;
        } else {
            if (b > c) return b;
        }
        return c;
    }
}
