public class FirstLastDigitSum {
    //Code
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            System.out.println("-1");
            return -1;
        }
        int lastdigit = number % 10;
        while (number > 9) {
            number = number /10;
        }
        int result = lastdigit + number;
        System.out.println(result);
        return result;
    }
    
}
