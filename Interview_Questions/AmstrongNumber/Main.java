import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main sol = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();
        sol.AmstrongNumber(num);
    }

    public void AmstrongNumber(int x) {
        long number = 0;
        int temp = x;
        int pop;

        while (x != 0) {
            pop = x % 10;
            x = x / 10;

            number = number + (pop * pop * pop);
        }
        if (temp == number) {
            System.out.println("Amstrong number");
        } else {
            System.out.println("Not an Amstrong Number");
        }

    }
}
