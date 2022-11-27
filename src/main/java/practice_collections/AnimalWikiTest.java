package main.java.practice_collections;

import java.util.HashMap;
import java.util.Map;

public class AnimalWikiTest {
    public static void main(String[] args) {
        Map<String,String> animals = new HashMap<>(Map.of("호랑이","tiger","표범","leopard","사자","lion"));
        System.out.printf("변경 전 : %s",animals);
        System.out.println();
        animals.replaceAll((k,v)->v.toUpperCase());
        System.out.println("변경 후 : "+ animals);
    }
}
