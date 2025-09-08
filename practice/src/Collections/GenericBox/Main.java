package Collections.GenericBox;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        Box<String> strBox = new Box<>();
        for (int i = 0; i < 8; i++) {
            intBox.addObject(i);
        }
        strBox.addObject("Shoe");
        strBox.addObject("Hat");
        strBox.addObject("Shirt");

        List<Box<?>> boxes = List.of(intBox, strBox);
        for(Box<?> box: boxes) {
          for(int i = 0; i < box.getSize(); i++) {
              System.out.println(box.getObject(i));
          }
        }
    }
 }
