public class EvenDigitSum 
{
    // public static int getEvenDigitSum(int number) {
    //     if (number < 0) {
    //         System.out.println("-1");
    //         return -1;
    //     }
    //     //code to return sum of even digits within the number
    //     int sum = 0;
    //     //int p = 0;
    //     while (number > 0) {
    //         if ((number % 10) % 2 == 0) {
    //             sum += number % 10;
    //         }
    //         number /= 10;
    //     }
    //     return sum;
    // }

        public static int getEvenDigitSum(int number) {
        if (number < 0) {
            System.out.println("-1");
            return -1;
        }
        //code to return sum of even digits within the number
        int sum = 0;
        //int p = 0;
        while (number > 0) {
            int remainder = number % 10;
            if ((remainder) % 2 == 0) {
                sum += remainder;// sum = sum + remainder//
            }
            number /= 10;
        }
        return sum;
    }
}
    // public class EvenDigitSum {
    //     public static int getEvenDigitSum(int number) {
     
    //         if (number < 0){
    //             return -1;
    //         }
     
    //         int sum = 0;    
    //         while (number > 0) { //loop ends when all the numbers have been tested
    //             if (((number%10)%2) == 0) { //test for the last digit is even
    //                 sum += number%10; //takes out the last digit
    //             }
    //             number /= 10; //takes out last digit to test the next digit
    //         }
    //         return sum;
    //     }
    // }