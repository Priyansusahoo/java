public class App {

  public static void main(String[] args) throws Exception {
    //System.out.println("Hello, World!");

    NumberOfDaysInMonth.isLeapYear(-1600);
    NumberOfDaysInMonth.isLeapYear(1600);
    NumberOfDaysInMonth.isLeapYear(2017);
    NumberOfDaysInMonth.isLeapYear(2000);

    NumberOfDaysInMonth.getDaysInMonth(1, 2020);
    NumberOfDaysInMonth.getDaysInMonth(2, 2020);
    NumberOfDaysInMonth.getDaysInMonth(2, 2018);
    NumberOfDaysInMonth.getDaysInMonth(-1, 2020);
    NumberOfDaysInMonth.getDaysInMonth(1, -2020);
  }
}
