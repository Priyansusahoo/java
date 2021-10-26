public class DecimalComparator {

  public static boolean areEqualByThreeDecimalPlaces(double A1, double A2) {
    A1 = (int) (A1 * 1000);
    A2 = (int) (A2 * 1000);

    if (A1 == A2) {
      return true;
    }
    return false;
  }
}
