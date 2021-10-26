public class App {

  public static void main(String[] args) throws Exception {
    boolean check1 = TeenNumberChecker.hasTeen(11, 12, 13);
    System.out.println(check1);
    boolean check2 = TeenNumberChecker.isTeen(14);
    System.out.println(check2);
  }
}
