public class test1 {

    public static void test(int number) {
        for (int i = 1; i < number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

    }

}