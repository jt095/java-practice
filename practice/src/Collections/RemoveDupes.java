package Collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupes {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1,1,5,4,3,3,8,1,9,0,45,5,7);
        Set<Integer> deDupedWithOrder = new LinkedHashSet<>(ints);
        System.out.println(deDupedWithOrder);
    }
}
