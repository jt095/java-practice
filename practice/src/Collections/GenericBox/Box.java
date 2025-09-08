package Collections.GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> objects = new ArrayList<>();

    public void addObject(T object) {
        objects.add(object);
    }

    public T getObject(int index) {
        try {
            return objects.get(index);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Box does not contain object at index: " + index);
        }
        return null;
    }

    public int getSize() {
        return objects.size();
    }
}
