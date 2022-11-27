package practice_rambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ShapeTest {
    static List<Shape> findShapesByType(List<Shape> shapes, String type) {
        List<Shape> results = new ArrayList<>();
        for(Shape s : shapes)
            if(type == s.type())
                results.add(s);
        return results;
    }
    static List<Shape> findShapesByColorNArea(List<Shape> shapes, String color, double area) {
        List<Shape> results = new ArrayList<>();
        for(Shape s : shapes)
            if(color == s.color() && area >= s.area())
                results.add(s);
        return results;
    }


    static List<Shape> findShapes(List<Shape> shapes, Predicate<Shape> p) {
        List<Shape> results = new ArrayList<>();
        for(Shape s : shapes)
            if(p.test(s))
                results.add(s);
        return results;
    }

    public static void main(String[] args) {
        System.out.println("사각형 : " + findShapesByType(Shape.shapes,"사각형"));
        System.out.println("빨간 도형(면적<=12.0) : " + findShapesByColorNArea(Shape.shapes,"빨간색",12.0));
        System.out.println(findShapes(Shape.shapes,s->s.area()<=12.0 && s.type()=="사각형" && s.color()=="빨간색"));
    }
}
