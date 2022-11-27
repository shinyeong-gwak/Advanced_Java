package main.java.practice_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dic2Test {
    public static void main(String[] args) {
        List<Map> list = new ArrayList<>();
        HashMap<String,String> map;

        map = new HashMap<>();
        map.put("eng","boy");
        map.put("han","머스마");
        list.add(map);

        map = new HashMap<>();
        map.put("eng","girl");
        map.put("han","가시나");
        list.add(map);

        list.forEach(m ->
                System.out.println(m.get("eng")+ " = " + m.get("han")));
    }
}
