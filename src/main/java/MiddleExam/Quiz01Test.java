package main.java.MiddleExam;// 아래 밑줄 친 부분(하나 이상의 스트림 연산식으로 구성)을 완성하라.

/* 실행 결과
가장 큰 빨간색 원 => 원(빨간색, 5.5)
김씨 이외 모임 => [이성신(165.0cm), 박자동(162.0cm)]
1
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz01Test {
    public static void main(String[] args) {
        List<Circle> circles = Arrays.asList(
                new Circle("빨간색", 3.2),
                new Circle("빨간색", 4.5),
                new Circle("빨간색", 5.5),
                new Circle("파란색", 3.4)
        );

        List<Person> persons = Arrays.asList(
                new Person("이성신", 165),
                new Person("김지신", 170),
                new Person("박자동", 162),
                new Person("김수정", 167)
        );

        System.out.print("가장 큰 빨간색 원 => ");
        Circle redBiggestCircle = circles
                .stream()
                .filter(c -> c.color().equals("빨간색")).max(Comparator.comparing(Circle::area)).get();
        System.out.println(redBiggestCircle);

        System.out.print("김씨 이외 모임 => ");
        List<Person> notKims = persons
                .stream()
                .filter(p -> !p.name().startsWith("김"))
                .collect(Collectors.toList());
        System.out.println(notKims);
    }
}

record Circle(String color, double area) {
    @Override
    public String toString() {
        return String.format("원(%s, %.1f)", color, area);
    }
}

record Person(String name, double height) {
    @Override
    public String toString() {
        return name + "(" + height + "cm)";
    }
}