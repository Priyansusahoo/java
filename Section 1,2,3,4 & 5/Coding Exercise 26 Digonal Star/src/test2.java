public class test2 {
    // public static void test(int number) {
    // for (int i = 1; i < number; i++) {
    // for (int j = 1; j <= i; j++) {
    // if (i >= 2 && j <= i - 1) {
    // System.out.print(" ");
    // } else {
    // System.out.print(" * ");
    // }
    // }

    // System.out.println();
    // }

    // }

    public static void test(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                if (i >= 2 && j <= i - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

    }
}
