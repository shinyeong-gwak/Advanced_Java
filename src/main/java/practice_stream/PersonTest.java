package main.java.practice_stream;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

enum Gender {여,남};

public class PersonTest {
    static List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
    static List<Gender> genders = List.of(Gender.남,Gender.여,Gender.남,Gender.남,Gender.남,Gender.여);

    public static void main(String[] args) {
        IntStream ageStream1 = ages.stream().mapToInt(Integer::intValue);
        OptionalInt sumAge = ageStream1.reduce((a, b) -> a+b);
        sumAge.stream().forEach(System.out::println);
        IntStream ageStream2 = ages.stream().mapToInt(Integer::intValue);
        ageStream2.max().stream().forEach(System.out::println);
        IntStream ageStream3 = ages.stream().mapToInt(Integer::intValue);
        ageStream3.average().stream().forEach(System.out::println);

    }
}
