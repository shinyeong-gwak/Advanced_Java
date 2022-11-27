package main.java.MiddleExam;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class ex01 {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<>();
        lists.addAll(List.of(5,3,1,7));
        lists.replaceAll(i -> i+10);
        System.out.println(lists);
    }
}
