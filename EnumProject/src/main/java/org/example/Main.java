package org.example;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            DayOfTheWeek weekDay = getRandomDay();
            System.out.println("Name : " + weekDay.name() + ", Ordinal Value : " + weekDay.ordinal());

            if (weekDay == DayOfTheWeek.SATURDAY || weekDay == DayOfTheWeek.SUNDAY) {
                System.out.println("It's a weekend!");
            }
        }
        System.out.println("\n");
        for (Veggis veggis : Veggis.values()) {
            System.out.println(veggis.name() + " costs " + veggis.getPrice());
        }
    }

    public static DayOfTheWeek getRandomDay() {
        int random = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[random];
    }
}