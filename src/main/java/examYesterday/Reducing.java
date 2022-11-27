package main.java.examYesterday;

import java.util.Arrays;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        int[] ilist = {3,4,7,3,2,1,8};
        double aver = Arrays.stream(ilist).average().getAsDouble();
        System.out.println(aver);
        Optional<Integer> op = Optional.of(30);
        System.out.println(op);
        System.out.println(op.get());
    }
}
