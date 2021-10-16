public class Main {

  public static void main(String[] args) throws Exception {
    System.out.println("The output is given below");

    printDayOfTheWeek(0);
    printDayOfTheWeek(1);
    printDayOfTheWeek(2);
    printDayOfTheWeek(3);
    printDayOfTheWeek(4);
    printDayOfTheWeek(5);
    printDayOfTheWeek(6);
    printDayOfTheWeek(-6);
    printDayOfTheWeek(7);
    printDayOfTheWeek2(7);
  }

  public static void printDayOfTheWeek(int day) {
    //int switchDay = day;
    switch (day) {
      case 0:
        System.out.println("Day is Sunday");
        break;
      case 1:
        System.out.println("Day is Monday");
        break;
      case 2:
        System.out.println("Day is Tuesday");
        break;
      case 3:
        System.out.println("Day is Wednesday");
        break;
      case 4:
        System.out.println("Day is Thursday");
        break;
      case 5:
        System.out.println("Day is Friday");
        break;
      case 6:
        System.out.println("Day is Saturday");
        break;
      default:
        System.out.println("Day is a Invalid day");
        break;
    }
  }

  public static void printDayOfTheWeek2(int day) {
    if (day == 0) {
      System.out.println("It is Sunday");
    } else if (day == 1) {
      System.out.println("It is Monday");
    } else if (day == 2) {
      System.out.println("It is Tuesday");
    } else if (day == 3) {
      System.out.println("It is Wednesday");
    } else if (day == 4) {
      System.out.println("It is Thursday");
    } else if (day == 5) {
      System.out.println("It is Friday");
    } else if (day == 6) {
      System.out.println("It is Saturday");
    } else {
      System.out.println("It is a Invalid Value");
    }
  }
}
