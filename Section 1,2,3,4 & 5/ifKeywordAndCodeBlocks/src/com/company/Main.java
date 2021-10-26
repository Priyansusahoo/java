package com.company;

public class Main {

  public static void main(String[] args) {
    boolean gameOver = true;
    int score = 800;
    int levelComplete = 5;
    int bonus = 100;

    int highScore = calculateScore(gameOver, score, levelComplete, bonus);
    System.out.println("Your final score was " + highScore);

    score = 10000;
    levelComplete = 8;
    bonus = 200;

    highScore = calculateScore(gameOver, score, levelComplete, bonus);
    System.out.println("Your final score was " + highScore);
  }

  public static int calculateScore(
    boolean gameOver,
    int score,
    int levelComplete,
    int bonus
  ) {
    if (gameOver) {
      int finalScore = score + (levelComplete * bonus);
      finalScore += 2000;
      return finalScore;
    }

    return -1;
  }
}
