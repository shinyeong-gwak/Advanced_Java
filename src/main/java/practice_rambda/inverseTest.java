package practice_rambda;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class inverseTest {

    public static void main(String[] args) throws IOException {
        String str = "Korean";
        char[] strArr = str.toCharArray();
        Character[] charArr = new Character[6];
        for (int i = 0; i<str.length();i++)
            charArr[i] = strArr[i];

        System.out.print("정렬 전 : ");
        for (char c : charArr) {
            System.out.print(c+" ");
        }
        System.out.println();

        Arrays.sort(charArr,Comparator.comparing(Character::toLowerCase));
        System.out.print("정렬 후 : ");
        for (char r : charArr) {
            System.out.print(r+" ");
        }
    }
}
