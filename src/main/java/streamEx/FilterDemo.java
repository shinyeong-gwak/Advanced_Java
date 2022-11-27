package streamEx;

import streamExternal.Util;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("a1","b1","b2","c1","c2","c3");
        Stream<String> s2 = s1.filter(s -> s.startsWith("c"));
        Stream<String> s3 = s2.skip(1);
        s3.forEach(Util::print);

        IntStream i1 = IntStream.of(1,2,1,3,3,2,4);
        IntStream i2 = i1.filter(i -> i % 2 ==0);
        IntStream i3 = i2.distinct();
        System.out.print("\n정수 스트림 : ");
        i3.forEach(Util::print);

        System.out.println();

    }
}

// filter 는 if문 같은 역할, map은 실행문 같은 역할을 함
