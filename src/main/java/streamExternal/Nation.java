package streamExternal;

import java.util.List;

public record Nation(String name, Type type, double population, int gdpRank){
    public enum Type { LAND,ISLAND}
    public String toString() {return name +"("+population+")";}
    public boolean isIsland() {return type() != Type.LAND;}
    public static final List<Nation> nations = List.of(
            new Nation("ROK", Type.LAND, 51.4,11),
            new Nation("New Zealand", Type.ISLAND, 4.5,49),
            new Nation("USA",Type.LAND,318.9,1),
            new Nation("China",Type.LAND,1355.7,2),
            new Nation("Philiphine",Type.ISLAND,107.7,36),
            new Nation("UK",Type.ISLAND,63.7,5),
            new Nation("Sri Lanka", Type.ISLAND,21.9,63),
            new Nation("Morocco",Type.LAND,33.0,60)
    );
}

//public class Nation {
//    private final String name; private final Type type;
//    private final double population; private final int gdpRank;
//
//    public Nation(String name, Type type, double population, int gdpRank) {
//        this.name = name; this.type=type;
//        this.population = population; this.gdpRank = gdpRank;
//    }
//
//    public String getName() {return name;}
//    public Type getType() {return type;}
//    public boolean isIsland() {return getType() != Type.LAND;}
//    public double getPopulation() {return population;}
//    public int getGdpRank() {return gdpRank;}
//    public enum Type { LAND,ISLAND}
//    public String toString() {return name +"("+population+")";}
//
//    public static final List<Nation>nations = List.of(
//            new Nation("ROK", Type.LAND, 51.4,11),
//            new Nation("New Zealand", Type.ISLAND, 4.5,49),
//            new Nation("USA",Type.LAND,318.9,1),
//            new Nation("China",Type.LAND,1355.7,2),
//            new Nation("Philiphine",Type.ISLAND,107.7,36),
//            new Nation("UK",Type.ISLAND,63.7,5),
//            new Nation("Sri Lanka", Type.ISLAND,21.9,63),
//            new Nation("Morocco",Type.LAND,33.0,60)
//    );
//}
