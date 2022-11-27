package main.java.practice_stream;

import java.util.List;
import java.util.stream.Stream;

record Population(String name, double population) {
    public String toString() {
        return String.format("%s(%.1f)",name,population);
    }
}

public class CapitalTest {
    static int i = 0;
    public static void main(String[] args) {
        List<String> names = List.of("서울","워싱턴","베이징","파리","마그리드","런던");
        List<Double> populations = List.of(973.7,63.2,2115.0,224.4,326.5,853.9);
        Stream<Population> ps = names.stream().map(n -> new Population(n,populations.get(i++)));
        ps.filter(p->p.population()>=300).forEach(p -> System.out.println(p));
    }
}
