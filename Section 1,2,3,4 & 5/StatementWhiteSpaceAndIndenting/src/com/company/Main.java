package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here
    int myVariable = 50;
    if (myVariable == 50) {
      System.out.println("Non sence");
    }

    myVariable++;
    myVariable--;

    System.out.println("This is a test");

    System.out.println(
      "This is " + "another " + "statement " + "and there is still more "
    );

    int anotherVariable = 50;
    myVariable--;
    System.out.println("This is another statement");
  }
}
