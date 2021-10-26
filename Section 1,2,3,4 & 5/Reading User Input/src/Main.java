import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input : Year of birth
        System.out.print("Enter your YearOfBirth:");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character so that it does not skip the input for name &
                                // handles the enter Key

            // Input : name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;

            if (age >= 0 && age <= 200) {
                System.out.println("Your name is " + name + " , and you are " + age + " years old.");

            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth.");
        }

        // output : name & Year of birth

        scanner.close();
    }
}
