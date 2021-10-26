public class NumberPalindrome 
{
  
  public static boolean isPalindrome(int number)
  {
        
        // int reverse = 0;
        // int originalNumber = number;
            
        // while (number !=0)
        // {
        //     int lastDigit = number % 10;
        //     reverse = (reverse * 10) + lastDigit;
        //     number /= 10;
        // }
        //     return originalNumber == reverse; 

        int r = 0;
        int p = 0;
        int t = number;
        while (number != 0) {
            r = number % 10;
            number = number / 10;
            p = p *10 + r;
        }
        return t==p;
  }
}
