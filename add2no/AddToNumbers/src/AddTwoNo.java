public class AddTwoNo {
    public static void main(String[] args) throws Exception
    {
        getTotal(1, 2);
        getTotal(10, 20);
        getTotal(10000, 222222);
        getTotal(17464749, 26474574);
        getTotal(194949, 27476474);
    }
    public static int getTotal(int a, int b) 
    {
        int sum = a + b; 
        System.out.println("The sum of two numbers " + a +" and " + b + " is " + sum);
        return sum;        
    }
}
