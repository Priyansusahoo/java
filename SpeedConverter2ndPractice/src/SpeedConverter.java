public class SpeedConverter {

  public static long toMilesPerHour(double kilometersPerHour) {
    //if Invalid value
    if (kilometersPerHour < 0) {
      return -1;
    }
    //return rounded value
    return Math.round(kilometersPerHour / 1.609);
  }

  public static void printConversion(double kilometersPerHour) {
    if (kilometersPerHour < 0) {
      System.out.println("Invalid Value");
    } else {
      long CalculateMilesPerHour = toMilesPerHour(kilometersPerHour);
      System.out.println(CalculateMilesPerHour);
    }
  }
}
