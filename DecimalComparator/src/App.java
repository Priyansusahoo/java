public class App {

  public static void main(String[] args) throws Exception {
    boolean check = DecimalComparator.areEqualByThreeDecimalPlaces(
      -3.1756,
      -3.175
    );
    System.out.println(check);
  }
}
