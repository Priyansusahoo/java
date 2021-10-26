public class LargestPrime {
    // public static int getLargestPrime(int number) {
    // if (number < 2) {
    // return -1;
    // }
    // for (int i = 2; i < number; i++) {

    // if ((number % i) == 0) {
    // number /= i;
    // i--;
    // }
    // }
    // return number;
    // }

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;

        }

        for (int i = number / 2; i > 1; i--) {
            if (number % i == 0) {
                number = i;
            }
        }
        return number;
    }
}