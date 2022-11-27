package previous_1;

import java.util.*;
import java.util.function.Predicate;

record Circle(String name, double area) {
    public String toString() {
        return "원("+name()+","+area()+")";
    }
}
record Person(String name, double height) {
    public String toString() {
        return name()+"("+height()+"cm)";
    }
}

public class Quiz01 {
    static <T> List<T> find(List<T> list, Predicate<T> p) {
        List<T> myList = new ArrayList<>();
        for(T t:list) {
            if (p.test(t))
                myList.add(t);
        }
        return myList;
    }
    public static void main(String[] args) { // static 메소드는 static메소드만 부를 수 있음
        List<Circle> circles = Arrays.asList(
                new Circle("빨간색", 3.2),
                new Circle("빨간색", 4.5),
                new Circle("빨간색", 5.5),
                new Circle("파란색", 3.4)
        );
        
        List<Person> persons = Arrays.asList(
                new Person("이성신", 165),
                new Person("김지신", 170),
                new Person("박자동", 162),
                new Person("김수정", 167)
        );

	// 5점
        Collections.sort(circles, Comparator.comparing(Circle::area)); ////
        //Collections.sort(circles, (a,b) -> (double)a.area() - (double)b.area());
        System.out.println(circles);
        Collections.sort(persons, Comparator.comparing(Person::name)); ////

	// 5점
        List<Circle> redBigCircles = find(circles, x->x.area()>=4.0 && x.name().equals("빨간색"));
        System.out.print("빨간색 원(면적 >= 4.0) : ");
        System.out.println(redBigCircles);


        System.out.println("---------------------------------");

	// 5점
    List<Person> notKims = find(persons, x->!x.name().contains("김")); // startsWith
        System.out.print("김씨 이외 모임 = ");
        System.out.println(notKims);
    }

	// 20점
    // find() 메서드 정의
	// 색상과 면적을 사용하여 원하는 원(circle)만 찾거나
	// 특정한 사람(person)만 찾는 메서드
	// 만약 두 가지 기능 중 제네릭 타입을 사용하지 않아
	// 한 가지 기능만 동작한다면 10점
	// 두 가지 기능 모두 동작한다면 20점
	// 힌트 : Predicate 함수형 인터페이스 사용
}

// 15점(둘 중 하나만 맞으면 10점)
// 레코드를 사용하여 Circle과 Person 정의
// 정의된 Circle과 Person 레코드를 이용하여 main()를 실행한 결과
// 다른 형태로 출력된다면 각각 2점씩 감점
// Circle 클래스의 멤버 변수는 String 타입의 name과 double 타입의 area
// Person 클래스의 멤버 변수는 String 타입의 name과 double 타입의 height


//[원(빨간색, 3.2), 원(파란색, 3.4), 원(빨간색, 4.5), 원(빨간색, 5.5)]
//빨간색 원(면적 >= 4.0) : [원(빨간색, 4.5), 원(빨간색, 5.5)]
//---------------------------------
//김씨 이외 모임 = [박자동(162.0cm), 이성신(165.0cm)]