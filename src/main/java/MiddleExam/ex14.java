package main.java.MiddleExam;

import java.util.HashMap;
import java.util.Map;

public class ex14 {
    public static void main(String[] args) {
        Map<String,Integer> fruits = new HashMap<>();
        fruits.putAll(Map.of("apple",5,"banna",3,"cherry",10));
        fruits.values().stream().forEach(s-> System.out.println(s));
    }
}
