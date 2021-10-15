public class AreaCalculator {

  public static double area(double radius) {
    if (radius < 0) {
      return -1.0;
    }

    //area of a circle
    double Carea = radius * radius * Math.PI;
    return Carea;
  }

  // x & y represent sides of rectangle
  public static double area(double x, double y) {
    if ((x < 0 || y < 0) || (x < 0 && y < 0)) {
      return -1.0;
    }
    // area of rectangle
    double Rarea = x * y;
    return Rarea;
  }
}
