public class test3 {

    public static void test(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = number; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i >= 2 && k > 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
