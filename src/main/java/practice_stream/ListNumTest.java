package main.java.practice_stream;

import java.util.List;
import java.util.stream.Stream;
import java.util.Optional;

public class ListNumTest {
    public static List<String> names = List.of("홍길동","배장화","임꺽정","연흥부","김선달","황진이");

    public static void main(String[] args) {
//        Stream<String> naSt = names.stream();
//        naSt.filter(s-> !s.startsWith("연")).;


        Stream<String> nameStream2 = names.stream();
        nameStream2.sorted().forEach(s -> System.out.println(s));
        Stream<String> nameStream3 = names.stream();
        Optional op = nameStream3.findFirst();
        System.out.println(op);
        op.stream().forEach(s-> System.out.println(s));
        Stream<String> nameStream4 = names.stream();
        System.out.println(nameStream4.count());
    }
}
