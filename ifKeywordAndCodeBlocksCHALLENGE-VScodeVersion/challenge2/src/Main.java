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

    int highScorePosition = calculateplayersScore(1500);
    displayHighScorePosition("ULTRA LEGEND BABU", highScorePosition);

    highScorePosition = calculateplayersScore(900);
    displayHighScorePosition(
      "Jewel BABUA (number one gandu)",
      highScorePosition
    );

    highScorePosition = calculateplayersScore(400);
    displayHighScorePosition("BABU", highScorePosition);

    highScorePosition = calculateplayersScore(50);
    displayHighScorePosition("PAISA BARBAD", highScorePosition);

    highScorePosition = calculateplayersScore(1000);
    displayHighScorePosition("LEGEND BABU", highScorePosition);

    highScorePosition = calculateplayersScore(500);
    displayHighScorePosition("OKAY OKAY BABU", highScorePosition);

    highScorePosition = calculateplayersScore(100);
    displayHighScorePosition("Luavda BHAK", highScorePosition);
  }

  public static void displayHighScorePosition(
    String playerName,
    int highScorePosition
  ) {
    System.out.println(
      playerName +
      " managed to get into position " +
      highScorePosition +
      " on the high score table "
    );
  }

  public static int calculateplayersScore(int playersScore) {
    //     if (playersScore >= 1000){

    //         return 1;
    //     }

    //    else if (playersScore >= 500) {

    //         return 2;
    //     }

    //    else if (playersScore >= 100) {

    //         return 3;
    //     }
    //     return 4;

    int position = 4; // assuming position 4 will be returned

    if (playersScore >= 1000) {
      position = 1;
    } else if (playersScore >= 500) {
      position = 2;
    } else if (playersScore >= 100) {
      position = 3;
    }

    return position;
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
