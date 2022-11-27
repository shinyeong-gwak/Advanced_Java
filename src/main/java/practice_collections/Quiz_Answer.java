package main.java.practice_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

public class Quiz_Answer {
    public static void main(String[] args) {
        //Map<String,Integer> variable = new HashMap<>(Map.of("해쉬",1,"아",2));

        List<String> presidents = List.of("이승만","박정희","전두환");
        Iterator<String> iterator = presidents.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());

    }
}
