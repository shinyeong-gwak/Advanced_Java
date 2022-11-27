package streamEx;

import streamExternal.Nation;
import streamExternal.Util;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Map2Demo {
    public static void main(String[] args) {
        Stream<Nation> n1 = Nation.nations.stream();
        Stream<String> s1 = n1.map(Nation::name);
        s1.limit(4).forEach(Util::printWithParenthesis);
        System.out.println();

        Stream<Nation> n2 = Nation.nations.stream();
        IntStream is = n2.mapToInt(Nation::gdpRank);
        is.forEach(Util::print);
    }
}
