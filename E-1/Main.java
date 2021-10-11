public class Main {

  public static void main(String[] args) {
    printConversion(1.5);
    printConversion(10.25);
    printConversion(-5.6);
    printConversion(25.42);
  }

  // public static long toMilesPerHour(double kilometersPerHour) {

  //     if (kilometersPerHour < 0){
  //         return -1;
  //     }
  //     else if (kilometersPerHour > 0) {
  //         printConversion(1.5);
  //         printConversion(10.25);
  //         printConversion(-5.6);
  //         printConversion(25.42);
  //     }
  //     return printConversion(1.5);///////////

  // }

  public static void printConversion(double kilometersPerHour) {
    double milesPerHour = kilometersPerHour / 0.621371d;
    System.out.println(milesPerHour);

    if (kilometersPerHour < 0) {
      System.out.println("Invalid Value");
    }
    //  else if (kilometersPerHour > 0) {
    //     System.out.println("Output is " +kilometersPerHour+ "km/h" = milesPerHour+ "mi/h");

    //  }

    //  double XX = kilometersPerHour;
    //  double YY = milesPerHour;
    //  if (XX == kilometersPerHour)
    //     {
    //         System.out.println(kilometersPerHour + "Km/h");

    //     }

  }
}
