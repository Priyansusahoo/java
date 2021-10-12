public class Main {

  public static void main(String[] args) {
    int NewScore = calculateScore("Priyansu", 500);
    System.out.println("New score is " + NewScore);

    int UnnamedScore = calculateScore(500);
    System.out.println("Unnamed new Score is " + UnnamedScore);

    calculateScore();

    double checkC1 = challenge1.calcFeetAndInchesToCentimeters(6, 13);
    if (checkC1 < 0.0) {
      System.out.println("Invalid Parameters ");
    }

    challenge1.calcFeetAndInchesToCentimeters(157);
  }

  public static int calculateScore(String playerName, int score) {
    System.out.println("Player " + playerName + " scored " + score + " points");
    return score * 1000;
  }

  public static int calculateScore(int score) {
    System.out.println(" Unnamed Player scored " + score + " points");
    return score * 1000;
  }

  public static int calculateScore() {
    System.out.println("Gand* Mar*");
    return 0;
  }
}
