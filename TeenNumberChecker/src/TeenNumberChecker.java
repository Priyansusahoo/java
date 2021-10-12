public class TeenNumberChecker {

  public static boolean hasTeen(int A1, int A2, int A3) {
    if (
      (A1 >= 13 && A1 <= 19) || (A2 >= 13 && A2 <= 19) || (A3 >= 13 && A3 <= 19)
    ) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean isTeen(int A0) {
    if ((A0 >= 13 && A0 <= 19)) {
      return true;
    } else {
      return false;
    }
  }
}
