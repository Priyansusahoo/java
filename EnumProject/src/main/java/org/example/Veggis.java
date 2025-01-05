package org.example;

public enum Veggis {
    TOMATO, POTATO, ONION, CARROT, CUCUMBER;

    public double getPrice() {
        return switch (this) {
            case TOMATO -> 1.5;
            case POTATO -> 2.0;
            case ONION -> 1.0;
            case CARROT -> 1.2;
            case CUCUMBER -> 1.8;
        };
    }
}
