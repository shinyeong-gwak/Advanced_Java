package streamEx;

//p.506부터는 뒤에는 안함
import streamExternal.Util;

import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Stream1Test {
    public static void main(String[] args) {
        OptionalDouble od = Stream.of("a1","a2","c1","d1","c7")
                .filter(s -> s.startsWith("c"))
                .map(s -> s.substring(1,s.length()))
                .mapToInt(s -> Integer.parseInt(s))
                .average();
        System.out.println(od.getAsDouble());
    }

//    s2.forEach
}
