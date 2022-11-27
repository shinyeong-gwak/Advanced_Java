package main.java.practice_stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingTest {
    public static void main(String[] args) {
        List<String> names = List.of("민국","지우","하준","지우","하준","지우");
        Map<String, List<String>> map1 = names.stream().collect(Collectors.groupingBy(s-> s));
        Map<String, Integer> resMap = new HashMap<>();
        for (String k : map1.keySet()) {
            resMap.put(k,map1.get(k).size());
        }
        System.out.println(resMap);
    }
}
