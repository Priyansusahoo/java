public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("Bye World! this is the output :");

    double AreaOfCircle = AreaCalculator.area(5.0);
    System.out.println(AreaOfCircle);

    AreaOfCircle = AreaCalculator.area(-1.0);
    System.out.println(AreaOfCircle);

    double AreaOfRectangle = AreaCalculator.area(5.0, 4.0);
    System.out.println(AreaOfRectangle);

    AreaOfRectangle = AreaCalculator.area(-1.0, 4.0);
    System.out.println(AreaOfRectangle);
    // AreaCalculator.area(5.0);
    // AreaCalculator.area(-1);
    // AreaCalculator.area(5.0, 4.0);
    // AreaCalculator.area(-1.0, 4.0);
  }
}
