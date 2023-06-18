package JAVA_INTERVIEW_BIT.ShallowAndDeepCopy;

class Main {
    public static void main(String[] args) {

        Rectangle obj1 = new Rectangle();
        Rectangle obj2 = new Rectangle();
        // Deep Copy
        Rectangle obj2 = obj1.clone();
    }
}
