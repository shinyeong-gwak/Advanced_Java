package main.java.practice_collections;

import java.util.*;

public class DicTest {
    public static void main(String[] args) {

        Map<String, String> dictionary = Map.of("cat", "고네미", "aunt", "아지매", "noodle", "국시", "child", "얼라");
        dictionary = new HashMap<>(dictionary);
        dictionary.put("head", "대갈빡");
        dictionary.put("teacher", "쌤");
        dictionary.forEach((k, v) -> System.out.printf("영어 : %s -> 한글 : %s\n", k, v));

        for(String k:dictionary.keySet()) {
            System.out.println(String.format("%s=%s ",k,dictionary.get(k)));
        }

        Collection<String> collection1 = dictionary.values();
        List<String> list = new ArrayList<>(collection1.stream().toList());
        Collections.shuffle(list);
        list.forEach(System.out::println);
    }
}
