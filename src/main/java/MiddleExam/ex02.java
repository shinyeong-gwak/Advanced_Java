package main.java.MiddleExam;

import java.util.Comparator;
import java.util.stream.Stream;

public class ex02 {
    public static void main(String[] args) {
        Integer rowest = Stream.of(4,2,3,7,6,5,1)
                .max((a,b) -> b - a).get(); //???????????????????????????-는 뭐하는 애야
        System.out.println(rowest);
    }
}
