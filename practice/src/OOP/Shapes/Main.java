package OOP.Shapes;

import org.w3c.dom.css.Rect;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(6), new Rectangle(4, 10));
        for(Shape s: shapes) {
            System.out.println(s.getArea() + ", " + s.getPerimeter());
        }

    }
}
