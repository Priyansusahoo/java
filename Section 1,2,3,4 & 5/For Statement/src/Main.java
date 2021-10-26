public class Main {

  public static void main(String[] args) {
    //code
    System.out.println(
      "10000 at 2% interest = " + calculateInterest(10000, 2.0)
    );
    System.out.println(
      "10000 at 3% interest = " + calculateInterest(10000, 3.0)
    );
    System.out.println(
      "10000 at 4% interest = " + calculateInterest(10000, 4.0)
    );
    System.out.println(
      "10000 at 5% interest = " + calculateInterest(10000, 5.0)
    );
    System.out.println("****************************************");

    for (int i = 0; i < 10; i++) {
      System.out.println("hahahahahahha " + i + " ooooooooooooooooooh");
    }

    //Challenge 1
    for (int i = 2; i < 9; i++) {
      System.out.println(
        "10000 at " +
        i +
        "% interest = " +
        String.format("%.2f", calculateInterest(10000, i))
      );
    }

    System.out.println(
      "*****************************************************************"
    );
    //challenge 2
    for (int i = 8; i >= 2; i--) {
      System.out.println(
        "10000 at " +
        i +
        "% interest = " +
        String.format("%.2f", calculateInterest(10000, i))
      );

      for (int k = 100; k > 0; k+= 10) {
        System.out.println(k);
      }
    }
    System.out.println("***********");

    int count = 0;
    for(int i = 10; 1< 50; i++){
      if (isPrime(i)) {
        count++;
        System.out.println("Number " + i + " is a prime number");
        if (count == 10) {
          System.out.println("Exiting for loop");
          break;
          
        }
      }
    }

    }
    public static boolean isPrime(int n) {

      if (n == 1) {
        return false;
        
      }
      for (int i = 2; i <= n/2; i++) {
        System.out.println("Looping " + i);
        if (n % i == 0) {
          return false;
        }
        
      }
      return true;

      
  }


  public static double calculateInterest(double amount, double interestRate) {
    return (amount * (interestRate / 100));
  }
}
