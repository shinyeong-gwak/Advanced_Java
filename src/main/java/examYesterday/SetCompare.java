package main.java.examYesterday;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCompare {
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet<>();
        s1.addAll(Arrays.asList("독수리","시발","존나","졸리네","벌써","피곤해"));
        System.out.println("hashset : "+ s1);

        TreeSet<String> s2 = new TreeSet<>(s1);
        System.out.println("TreeSet : " + s2);
        System.out.println("첫 번째 동물 : " +s2.first());
        System.out.println("마지막 동물 : " + s2.last());
        System.out.println("나비 옆에 있는 동물 : "+ s2.lower("시발"));

        //psvm 까먹지 않는다
        //treeset은 순서는 없지만 차곡차곡 정렬되어있는 형태로 다양한 메소드 활용이 가능하다.
        //변수 타입도 TreeSet 타입이어야 되고 부모타입으로는 해당 메소드를 쓸 수 없다.
    }
}
