public class Person {

    private String firstName;
    private String lastName;
    private int age = 0;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if ((age < 0) || (age > 100)) {
            age = 0;
        }
        this.age = age;
    }

    public boolean isTeen() {
        if ((age > 12) && (age < 20)) {
            // System.out.println("true");
            return true;
        }
        // System.out.println("false");
        return false;
    }

    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";

        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        if (firstName.isEmpty()) {
            return lastName;
        }
        return firstName + " " + lastName;
    }
}
