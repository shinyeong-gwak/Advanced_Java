package main.java.examYesterday;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchTest {
    public static void main(String[] args) {
        boolean b1 = Stream.of("a1","b2","c3").anyMatch(s->s.startsWith("c"));
        System.out.println(b1);

        boolean b2 = IntStream.of(10,20,30).allMatch(p -> p % 3 == 0);
        System.out.println(b2);

        boolean b3 = IntStream.of(1,2,3).noneMatch(p -> p == 3);
        System.out.println(b3);
    }
}
