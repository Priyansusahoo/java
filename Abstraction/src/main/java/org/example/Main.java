package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Wolf", "Big", 50);
        dog.makeNoise();
        doAnimalStuff(dog);
        Fish fish = new Fish("Goldfish", "Small", 0.5);
        doAnimalStuff(fish);
    }

    private static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        animal.move("fast");
    }
}
