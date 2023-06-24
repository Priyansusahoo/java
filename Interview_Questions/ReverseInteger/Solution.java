import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integer type: ");
        int number = sc.nextInt();
        sol.reverse(number);
    }

    public void reverse(int x) {
        long reverse = 0;
        int pop;

        while (x != 0) {
            pop = x % 10;
            x = x / 10;

            reverse = (reverse * 10) + pop;
        }
        if (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) {
            // return 0;
            System.out.println("Invalid");
        }
        // return (int) reverse;
        System.out.println("Reverse number = " + (int) reverse);
    }
}