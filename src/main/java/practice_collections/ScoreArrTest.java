package main.java.practice_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class ScoreArrTest {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (!scores.contains(-1)) {
            System.out.print("점수를 입력하세요 : ");
            scores.add(sc.nextInt());
        }
        scores.removeIf(i -> i==-1);
        System.out.println("전체 학생은 "+scores.size()+"명이다.");
        System.out.print("학생들의 성적 : ");
        scores.forEach(i->System.out.print(i +" "));
        System.out.println();
        Function<Integer,String> f = i ->
        {
            if (i >= 90) return "A";
            else if (i >= 80 && i < 90) return "B";
            else if (i >= 60 && i < 80) return "C";
            else return "D";
        };
        scores.forEach(i ->
                System.out.println(scores.indexOf(i)+"번 학생의 성적은 "+i+"점이며 등급은 "+f.apply(i)+"이다."));



    }
}
