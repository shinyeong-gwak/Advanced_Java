package main.java.Quiz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 실행 결과
모든 여학생 이름 = (배장화, 이수정, 황진이)
최고 점수 학생 = Student(이수정, 여, 91)
12 8 16 15 10 10 15 
*/

public class Quiz02 {
	// 필요하면 변수 추가 가능
    static int i = 0;
    public static void main(String[] args) {
        List<Person> persons = List.of(new Person("홍길동", Gender.남),
                new Person("배장화", Gender.여),
                new Person("임꺽정", Gender.남),
                new Person("연흥부", Gender.남),
                new Person("김선달", Gender.남),
                new Person("이수정", Gender.여),
                new Person("황진이", Gender.여));
        int[] scores = {75, 80, 79, 78, 82, 91, 78};

        // 1번 : 10점
        System.out.print("모든 여학생 이름 = ");
        String girls = persons.stream()
				.filter(p -> p.gender()==Gender.여).map(Person::name) // 1개 혹은 1개 이상의 연산 추가
                .collect(Collectors.joining(", ", "(", ")"));
        System.out.println(girls);

        // 2번 : 10점
        // people과 scores를 이용하여 Stream<Student> 타입의 ss를 생성
        // 필요하다면 지역 변수나 멤버 변수를 사용할 수 있음
        Stream<Student> ss =
                persons.stream().map(p -> new Student(p,scores[i++]));

        // 3번 : 10점
        System.out.print("최고 점수 학생 = ");
        Student highest = ss
				.max(Comparator.comparing(Student::score)).get(); // 1개 혹은 1개 이상의 연산 추가
        // ss.sorted((a,b) -> b.score() - a.score()).findFirst().get(); //도 가능
        System.out.println(highest);

        // 4번 : 10점
		// scores 배열을 가지고 스트림을 생성한 후 각 digit를 합한 결과를 출력
		// 배열의 원소가 75라면 7과 5를 합한 12를 출력
        UnaryOperator<Integer> f = i -> {
            String[] str = Integer.toString(i).split("");
            return Integer.parseInt(str[0])+Integer.parseInt(str[1]);
        };
        Arrays.stream(scores).map(i->f.apply(i)).forEach(s-> System.out.print(s+ " ")); // 스트림 생성 및 연산 추가
//        Arrays.stream(scores).map(i -> {
//            int in = i / 10;
//            return in + i - in * 10;
//        }).forEach(System.out::println); //도 가능
    }
}

enum Gender {남, 여}

record Person(String name, Gender gender) {
    public String toString() {
        return String.format("Person(%s, %s)", name, gender);
    }
}

// 5번 : 10점
// Person 타입의 person과 int 타입의 score를 멤버 변수로 사용하는 record 타입 Student를 정의
record Student (Person person, int score){
    public String toString() {
        return String.format("Student(%s, %s, %d)", person().name(),person().gender(),score);
    }
}