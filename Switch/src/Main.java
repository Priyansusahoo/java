public class Main {

  public static void main(String[] args) throws Exception {
    int switchValue = 1;
    char switchChar = 'C';
    String month = "JanUARy";

    switch (switchValue) {
      case 1:
        System.out.println("Value was 1");
        break;
      case 2:
        System.out.println("Value was 2");
        break;
      case 3:
        System.out.println("Value was 3");
        break;
      case 4:
      case 5:
      case 6:
        System.out.println("Either 4, 5 or 6");
        System.out.println(", Actually it was " + switchValue);
        break;
      default:
        System.out.println("It was neither 1, 2, 3, 4 ,5 or 6");
        break;
    }

    switch (switchChar) {
      case 'A':
        System.out.println("char A");
        break;
      case 'B':
        System.out.println("char B");
        break;
      case 'C':
      case 'D':
      case 'E':
        System.out.println(switchChar + " was found");
        break;
      //   case 'C':
      //     System.out.println("char C");
      //     break;
      //   case 'D':
      //     System.out.println("char D");
      //     break;
      //   case 'E':
      //     System.out.println("char E");
      //     break;
      default:
        System.out.println("not found");
        break;
    }

    switch (month.toLowerCase()) {
      case "january":
        System.out.println("Jan");
        break;
      case "febuary":
        System.out.println("feb");
        break;
      default:
        System.out.println("Not Sure");
        break;
    }
  }
}
