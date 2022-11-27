package main.java.practice_collections;

import java.util.*;

public class capitalsTest {
    public static void main(String[] args) {
        List<String> capitals = new ArrayList<>(List.of("서울","워싱턴","베이징","마그리드","파리","런던"));
        Collections.sort(capitals);
        System.out.println(capitals);

        Iterator<String> it = capitals.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        capitals.removeIf(s -> s.length()>=3);
        System.out.println(capitals);
    }
}
