package com.priyansu;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }
    public String getName() {
        return name;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String acceleration(){
        return "Car -> acceleration()";
    }
    public String brake(){
        return "Car -> brake";
    }
}

class Sizuki extends Car{

    public Sizuki(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Sizuki -> startEngine()";
    }

    @Override
    public String acceleration() {
        return "Sizuki -> acceleration()";
    }

    @Override
    public String brake() {
        return "Sizuki -> brake()";
    }
}

class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> startEngine()";
    }

    @Override
    public String acceleration() {
        return "Ford -> acceleration()";
    }

    @Override
    public String brake() {
        return "Ford -> brake()";
    }
}

class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + "-> startEngine()";
    }

    @Override
    public String acceleration() {
        return getClass().getSimpleName() + "-> acceleration()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() +  " -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(8,"Base car");
        System.out.println(car.startEngine());
        System.out.println( car.acceleration());
        System.out.println(car.brake());

        Sizuki sizuki = new Sizuki(6,"Weeei model");
        System.out.println(sizuki.startEngine());
        System.out.println(sizuki.acceleration());
        System.out.println(sizuki.brake());

        Ford ford = new Ford(6,"Waka Waka model");
        System.out.println(ford.startEngine());
        System.out.println(ford.acceleration());
        System.out.println(ford.brake());

        Holden holden = new Holden(6,"Waka Waka model");
        System.out.println(holden.startEngine());
        System.out.println(holden.acceleration());
        System.out.println(holden.brake());
    }
}
