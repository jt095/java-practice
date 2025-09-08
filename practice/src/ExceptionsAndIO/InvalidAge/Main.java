package ExceptionsAndIO.InvalidAge;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println(setAge(age));
    }

    private static int setAge(int age) {
        if (age < 0) {
            throw new InvalidAgeException();
        }
        return age;
    }
}
