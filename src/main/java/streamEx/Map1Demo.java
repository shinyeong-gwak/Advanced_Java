package streamEx;

import streamExternal.Util;

import javax.xml.transform.stream.StreamResult;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Map1Demo {
    public static void main(String[] args) {
        Stream<String> s3 = Stream.of("a1","a2","a3");
        Stream<String> s4 = s3.map(s-> s.substring(1));

        IntStream i3 = s4.mapToInt(Integer::parseInt);

        Stream<String> s5 = i3.mapToObj(i -> "b" + i);
        s5.forEach(Util::printWithParenthesis);
    }

}
