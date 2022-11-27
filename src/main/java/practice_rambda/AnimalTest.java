package practice_rambda;

import java.util.function.Supplier;

class Animal{
    public void sound(){
        System.out.println("ㅁㅁㄱㄱ");
    }
}

class Dog extends Animal {
    public void sound(){
        System.out.println("멍ㅁ어");
    }
}
public class AnimalTest {
    public static void soundAnimal(Supplier<Animal> s) {
        s.get().sound();
    }
    public static void main(String[] args) {
        soundAnimal(() -> new Animal());
        soundAnimal(() -> new Dog());
    }
}
