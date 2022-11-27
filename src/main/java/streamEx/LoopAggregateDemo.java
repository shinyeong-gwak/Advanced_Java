package streamEx;

import streamExternal.Nation;
import streamExternal.Util;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LoopAggregateDemo {
    public static void main(String[] args) {
        Stream<Nation> sn = Nation.nations.stream().peek(Util::printWithParenthesis);
        System.out.println("어디나타남?");// 버퍼에있던게 다음거 불러진 후 실행되는 것인가,,
        Optional<Nation> on = sn.max(Comparator.comparing(Nation::population));
        System.out.println();
        System.out.println(on.get());

        System.out.println(IntStream.of(5,1,2,3).min().getAsInt());

        sn = Nation.nations.stream();
        System.out.println(sn.count());
    }
}
