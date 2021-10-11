public class Main {

  public static void main(String[] args) throws Exception {
    BMI(78, 1.69);
    BMI(92, 1.95);
  }

  public static void BMI(int mass, double height) {
    if (height <= 0d && mass <= 0d) {
      System.out.println("Invalid number");
    } else if (height > 0d && mass > 0d) {
      double Index = mass / (height * height);
      System.out.println(Index);
    }
  }
}
