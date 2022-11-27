package main.java.practice_stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FuncTest {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5);
        stream.collect(Collectors.averagingInt(s -> s.intValue()));
        stream = Stream.of(1,2,3,4,5);
        stream.map(s -> s*s).collect(Collectors.averagingInt(s -> s.intValue()));
        stream = Stream.of(1,2,3,4,5);
        String result = stream.map(i -> i.toString()).reduce((s, s2) -> String.format("%s-%s",s,s2)).get();
        System.out.println(result);
    }
}
