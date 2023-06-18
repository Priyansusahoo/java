class Main {
    public static void main(String[] args) {
        final int i;
        i = 0;
        // i = i + 10; // throw error as it is already initialize,
        // because "final" keyword is used.
        System.out.println(i);
    }
}
