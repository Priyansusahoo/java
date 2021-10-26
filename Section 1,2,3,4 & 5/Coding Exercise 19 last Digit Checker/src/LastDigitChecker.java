public class LastDigitChecker {
    
    public static boolean hasSameLastDigit(int x, int y, int z) {
        if ((x < 10 || x > 1000) || (y < 10 || y > 1000) || (z < 10 || z > 1000)) {
            return false;
        }
        if ((x % 10 != y % 10) && (y % 10 != z % 10) && (x % 10 != z % 10)) {
            return false;
        }
        return ((x % 10 == y % 10) || (y % 10 == z % 10) || (x % 10 == z % 10));
    }

    public static boolean isValid(int a) {
        if ((a < 10 || a > 1000)) {
            return false;
        }
        return true;
    }
}
