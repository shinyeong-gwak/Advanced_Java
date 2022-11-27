package practice_rambda;

import java.util.function.UnaryOperator;

class FirstString {
    public static String startWith(String s){
        return Character.toString(s.charAt(0));
    }
}

public class FirstStringTest {
    public static void main(String[] args) {
        UnaryOperator<String> o = FirstString::startWith;
        System.out.println(o.apply("apples"));
    }
}
