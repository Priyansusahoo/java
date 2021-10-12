public class challenge1 {

  public static double calcFeetAndInchesToCentimeters(
    double feet,
    double inches
  ) {
    if ((feet >= 0) && (inches >= 0 && inches <= 12)) {
      double inchesToCentiM = inches * 2.54;
      double feetsToCentiM = (feet * 12) * 2.54;
      double sumOfInchesAndFeetInCentiM = inchesToCentiM + feetsToCentiM;
      System.out.println(sumOfInchesAndFeetInCentiM + " cm");
      return sumOfInchesAndFeetInCentiM;
    } else if ((feet < 0) || ((inches < 0) || (inches > 12))) {
      System.out.println("Invalid Feet or Inches");
      return -1;
    } else {
      return -1;
    }
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches < 0) {
      return -1;
    }

    double feet = (int) inches / 12;
    double remainingInches = (int) inches % 12;
    System.out.println(
      inches +
      " inches is equal to " +
      feet +
      " feet and " +
      remainingInches +
      " inches"
    );
    return calcFeetAndInchesToCentimeters(feet, remainingInches);
  }
}
