package com.company;

public class Main {

  public static void main(String[] args) {
    double V1 = 20.00d;
    double V2 = 80.00d;
    double V1V2M = (V1 + V2) * 100.00d;
    System.out.println(
      "----Sum of 2 numbers after multiplying by 100.00 is " + V1V2M + "----"
    );

    double reminder = V1V2M % 40.00d;
    System.out.println("----So the reminder is " + reminder + "----");

    boolean Noreminder = (reminder == 0) ? true : false;
    System.out.println("----The Reminder boolean is " + Noreminder + "----");

    if (!Noreminder) {
      System.out.println("----Got some reminder----");
    }
    // made some chages//
  }
}
