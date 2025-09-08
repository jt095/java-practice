package Collections;

import java.util.*;

public class GetSecondLargest {
    public static void main(String[] args) {
        List<Integer> nums = List.of(0, 1, 1, 3, 5, 7, 9, 9, 9, 10);
        // all unique and sorted naturally
        Set<Integer> set = new TreeSet<>(nums);
        List<Integer> listOfSet = new LinkedList<>(nums);
        System.out.println(listOfSet.get(listOfSet.size() - 2));
    }
}
