package main.java.MiddleExam;

import java.util.stream.Stream;

public class ex03 {
    public static void main(String[] args) {
       Stream<String> notBug = Stream.of("bug","apple").peek(System.out::println);
    }
}
