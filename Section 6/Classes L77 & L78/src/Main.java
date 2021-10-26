public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Car porsche = new Car();
        Car holden = new Car();
        // System.out.println("Model is " + porsche.getModel());
        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}