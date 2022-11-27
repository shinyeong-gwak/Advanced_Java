package main.java.practice_stream;

import java.util.List;
import java.util.stream.Stream;

public class AnimalStreamTest {
    public static void main(String[] args) {
        List<String> animals = List.of("갈매기","나비","다람쥐","라마");
        Stream<String> aniStream = animals.stream().filter(s -> s.length()<=2);
        aniStream.forEach(s -> System.out.print(s + " "));
    }
}
