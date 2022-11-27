package streamEx;

import streamExternal.Nation;
import streamExternal.Util;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("d2","a2","b1","b3","c");
        Stream<String> s2 = s1.sorted();
        s2.forEach(Util::print); //기본 이름 순으로

        System.out.print("\n국가이름 순 : ");
        Stream<Nation> n1 = Nation.nations.stream();
        Stream<Nation> n2 = n1.sorted(Comparator.comparing(Nation::name));
        Stream<String> s3 = n2.map(x -> x.name());
        s3.forEach(Util::printWithParenthesis);

        System.out.print("\n국가 GDP 순 : ");
        Stream<Nation> n3 = Nation.nations.stream();
        Stream<Nation> n4 = n3.sorted(Comparator.comparing(Nation::gdpRank));
        Stream<String> s4 = n4.map(Nation::name);
        s4.forEach(Util::printWithParenthesis);
    }
}
