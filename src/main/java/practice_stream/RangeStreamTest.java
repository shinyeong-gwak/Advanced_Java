package main.java.practice_stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RangeStreamTest {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).mapToObj(i -> String.format("A%d",i)).forEach(s -> System.out.print(s +" "));
    }
}
