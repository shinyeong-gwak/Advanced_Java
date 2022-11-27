package main.java.practice_stream;

import streamExternal.Nation;

import java.util.stream.Stream;

public class NationTest {
    public static void main(String[] args) {
        Stream<Nation> ns = Nation.nations.stream();
        String ss =  ns.filter(n -> !n.isIsland()).map(Nation::name).reduce((s, s2) -> s+", "+s2).get();
        System.out.println(ss);
    }

}
