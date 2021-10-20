public class App 
{
    public static void main(String[] args) throws Exception 
    {
        //System.out.println("Hello, World!");

        sumDigit(1);
        System.out.println("the sum of the digits in the number 125 = " + sumDigit(125));
        System.out.println("the sum of the digits in the number -125 = " + sumDigit(-125));
        System.out.println("the sum of the digits in the number 5 = " + sumDigit(5));
        System.out.println("the sum of the digits in the number 32123 = " + sumDigit(32123));


    }


    public static int sumDigit(int number) 
    {
        if (number < 10) {
            //System.out.println("sum is " + number);
            return -1;
        }
        int sum = 0;
        //125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125-20 = 5;
        while (number > 0) {
            //extract the least-significant digit
            int digit = number % 10;
            sum += digit;

            //drop least significant digit
            number /=10; // same as number = number/10;
        }
        return sum;

    }
}
