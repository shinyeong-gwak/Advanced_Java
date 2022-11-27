package main.java.previous_1;

class Shape{}

class Rectangle extends Shape {}

class Circcle extends Shape {}

public class chap09Prog02 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        casting(r);
    }

    static void casting(Shape s) {
        Circcle c= (Circcle) s;
    }
}
