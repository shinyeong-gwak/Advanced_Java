package main.java.MiddleExam;// 아래 밑줄 친 부분(하나 이상의 스트림 연산식으로 구성)을 완성하라.

/* 실행 결과
8000원 이하 음식 : [김밥(한식, 3000), 탕수육(중식, 8000), 비빔밥(한식, 7000)]
한식 : [김밥(한식, 3000), 비빔밥(한식, 7000), 불고기(한식, 10000)]
가격 인상된 한식 : [김밥(한식, 4000), 비빔밥(한식, 8000), 불고기(한식, 11000)]
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FoodTest {
    public static void main(String[] args) {
        Food[] foods = {
                new Food("김밥", "한식", 3000),
                new Food("탕수육", "중식", 8000),
                new Food("비빔밥", "한식", 7000),
                new Food("스시", "일식", 10000),
                new Food("불고기", "한식", 10000)};

        System.out.print("8000원 이하 음식 : ");
        // foods를 스트림으로 생성한 후 8000원 이하 음식만 출력하는 코드
        List<Food> cheapFoods = Arrays.stream(foods)
                .filter(f->f.price()<=8000)
                .collect(Collectors.toList());
        System.out.println(cheapFoods);

        System.out.print("한식 : ");
        // foods를 스트림으로 생성한 후 한식만 출력하는 코드
        List<Food> koreanFoods = Arrays.stream(foods)
                .filter(f-> f.kind().equals("한식"))
                .collect(Collectors.toList());
        System.out.println(koreanFoods);

        // foods를 스트림으로 생성한 후 한식만 출력하되
        // 코로나로 식자재 가격 상승을 반영하여 음식 값을 1000원 인상
        System.out.print("가격 인상된 한식 : ");
        List<Food> newPriceKoreanFoods = Arrays.stream(foods)
                .filter(f -> f.kind().equals("한식"))
                .collect(Collectors.toList());
        System.out.println(newPriceKoreanFoods);
    }
}


record Food(String name, String kind, int price) {
    @Override
    public String toString() {
        return name + "(" + kind + ", " + price + ")";
    }
}