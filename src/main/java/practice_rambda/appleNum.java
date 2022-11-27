package practice_rambda;

import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class appleNum {
    public static void main(String[] args) throws IOException {
        int number = 1;
        IntFunction<String> f = n -> (n>1)?n + " apples":n + " apple";
        System.out.println(f.apply(number));

        Consumer<Integer> c = n -> {
            if (n>1)
                System.out.println(n+" apples");
            else
                System.out.println(n+ " apple");
        };
        c.accept(4);
    }
}
