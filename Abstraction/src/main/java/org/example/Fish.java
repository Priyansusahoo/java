package org.example;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if (speed.equals("slow")) {
            System.out.println(type + " lazily swimming");
        } else {
            System.out.println(type + " darting through the water");
        }
    }

    @Override
    public void makeNoise() {
        if (type == "goldfish") {
            System.out.println("swish! ");
        } else {
            System.out.println("splash! ");
        }
    }
}
