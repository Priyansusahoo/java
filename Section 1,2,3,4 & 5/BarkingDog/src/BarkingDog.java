public class BarkingDog {

  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    boolean wakeUp = false;
    if (barking) {
      if (hourOfDay >= 0 && hourOfDay <= 23) {
        if (hourOfDay < 8 || hourOfDay > 22) {
          wakeUp = true;
        } else {
          return false;
        }
      }
    }
    return wakeUp;
  }
}
