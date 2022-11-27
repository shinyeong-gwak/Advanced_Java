package main.java.MiddleExam;

import java.util.stream.IntStream;

public class ex07 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.iterate(0, a->a+1).limit(26);
        intStream.map(i -> ('a'+i)).forEach(s -> System.out.print(s+" "));
    }
}
