public class MinutesToYearsDaysCalculator {

  public static void printYearsAndDays(long minutes) {
    if (minutes < 0) {
      System.out.println("Invalid Value");
    }
    //calculate years and days from minutes
    //In format XX min = YY y and ZZ d
    else if (minutes >= 525600) {
      long years = minutes / (60 * 24 * 365);
      long remainingminutes = minutes % (60 * 24 * 365);
      long remainingDays = remainingminutes / (60 * 24);
      System.out.println(
        minutes + " min = " + years + " y and " + remainingDays + " d"
      );
    } else if (minutes < 525600) {
      //   long remainingminutes = minutes % (60 * 24 * 365);
      long remainingDays = (minutes / (60 * 24));
      System.out.println(minutes + " min = " + remainingDays + " d");
      //+ "0" + " y and "
    } else {
      System.out.println("Fu*k that to do");
    }
  }
}
