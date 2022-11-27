package main.java.practice_collections;

import java.util.*;
import java.util.function.BiFunction;

public class CollUseTest {
    public static void main(String[] args) {
        String[] s1 = {"a","b","a","b","c"};
        String[] s2 = {"c"};

        HashSet<String> set1 = new HashSet<>();
        Collections.addAll(set1,s1);
        HashSet<String> set2 = new HashSet<>();
        Collections.addAll(set2,s2);
        System.out.println("set1 : " + set1);
        System.out.println("set2 : " + set2);
        boolean tru = set2 == set1;
        System.out.println("set1과 set2는 같다 : " + tru);
        System.out.println("set1은 set2의 모든 원소를 포함한다 : " + set1.containsAll(set2));
        HashSet<String> set3 = new HashSet<>(Arrays.asList(s1));
        HashSet<String> set4 = new HashSet<>(Arrays.asList(s2));

        set3.addAll(set4);
        System.out.println("합집합 : "+ set3 );
        set3 = new HashSet<>(Arrays.asList(s1));
        set3.retainAll(set4);
        System.out.println("교집합 : "+ set3 );

    }
}
