package practice_rambda;

import java.util.List;

public record Shape(String type, String color, double area){

    public String toString() {
        return type + '(' + color + ',' + area + ')';}

    public static List<Shape> shapes = List.of(
            new Shape("삼각형","빨간색",10.5),
            new Shape("사각형","파란색",11.2),
            new Shape("원","파란색",16.5),
            new Shape("원","빨간색",5.3),
            new Shape("원","노란색",8.1),
            new Shape("사각형","파란색",20.7),
            new Shape("삼각형","파란색",3.4),
            new Shape("사각형","빨간색",12.6)
    );

}
