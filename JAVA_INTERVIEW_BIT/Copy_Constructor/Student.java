import java.util.Scanner;

public class Student {
    private int rollNumber;
    private int age;
    private String name;

    // default constructor
    public Student(String name, int age, int rollNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    // copy constructor
    public Student(Student student) {
        this.rollNumber = student.rollNumber;
        this.name = student.name;
        this.age = student.age;
    }

    // method to print
    public void displayStudent() {
        System.out.println("Rollnumber : " + this.rollNumber);
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your RollNumber");
        int roll_number = scanner.nextInt();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        Student student = new Student(name, age, roll_number);

        System.out.println("\n");
        System.out.println("Contents of the original object");
        student.displayStudent();

        Student student_copy = new Student(student);

        System.out.println("\n");
        System.out.println("Contents of the copied object");
        student.displayStudent();
    }
}