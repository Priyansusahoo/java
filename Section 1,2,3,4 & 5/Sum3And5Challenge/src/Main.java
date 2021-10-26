public class Main {
    public static void main(String[] args) throws Exception {
        
        //CHALLENGE

        //Create a for statement using a range of numbers from 1 t0 1000 inclusive.
        //Sum all the numbers that can be divisible with both 3 and 5.
        //For those number that meet the above conditions, print out the number.
        //break out of the loop once you find 5 numbers that met the above conditions.
        //After breaking out of the loop print the sum of the numbers that meet the above conditions
        
        //NOTE: Type all code in main method

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000 ; i++) 
        {
            if ((i % 3 == 0) && (i % 5 == 0)) 
            {
                count++;
                sum += i;
                System.out.println("found number " + i);                
            }


            if (count == 5) 
                {
                    System.out.println("Exiting the loop");
                    break;
                    
                }
        }

        System.out.println("Sum = " + sum);
    }
}
