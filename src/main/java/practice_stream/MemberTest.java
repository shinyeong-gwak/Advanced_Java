package main.java.practice_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

record Member (String name, Gender gender, int age){
    @Override
    public String toString(){
        return String.format("Member(%s,%s,%d)",name,gender,age);
    }
}

public class MemberTest {
    static List<Gender> genders = PersonTest.genders;
    static List<Integer> ages = PersonTest.ages;
    static List<String> names = ListNumTest.names;
    static int i = 0;
    public static void main(String[] args) {
        Stream<String> nameStream = names.stream();
        Stream<Member> memStream = nameStream.map(n -> new Member(n,genders.get(i),ages.get(i++)));
        memStream.forEach(s-> System.out.print(s+ " "));
        nameStream = names.stream();
        System.out.println();
        i =0;
        memStream = nameStream.map(n -> new Member(n,genders.get(i),ages.get(i++)));
        Map<Gender, List<Member>> mapp = memStream.collect(Collectors.groupingBy(Member::gender));
        System.out.println(mapp);

        int[] arr = {3,5,2,1};
        IntStream is = Arrays.stream(arr);
        Stream<Integer> simX = is.boxed();

        //Stream<String> s1 = Stream.of("다른 사람","같은 단어","으아 몰라");
        //Stream<String[]> s2 = s1.map(s -> s.split(" "));
        //Stream<String> s3 = s2.flatMap(Arrays::stream);
        //s3.forEach(s -> System.out.println(s));

        //IntStream.range(1,5).forEach(i -> System.out.println(i));

        //List<Integer> scores = List.of(45, 76, 38, 27, 50);
        //Stream<Integer> si = scores.stream();
        //si.map(s -> s+10).forEach(System.out::print);

        //Stream<String> someStream = Stream.of("한놈","두식","석삼","너구리","오징어");
        //someStream.map(s -> 1).reduce((a,b)->a+b).ifPresent(s-> System.out.println(s));

        //Stream.iterate(new int[]{0,1},ints -> new int[]{ints[1],ints[0]+ints[1]}).limit(10).map(p -> p[0]).forEach(System.out::println);

    }
}
