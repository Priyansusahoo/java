package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
         * Boxing and Types
         */
        Integer boxedInt = Integer.valueOf(5); // Boxing

        Integer deprecatedBoxing = new Integer(5); // Deprecated

        int unboxedInt = boxedInt.intValue(); // unnecessary

        Integer testBoxedInt = 5; // Auto-boxing

        int testUnboxedInt = testBoxedInt; // Auto-Unboxing

        System.out.println(testBoxedInt.getClass().getName());

        /**
         * Double - double
         */
        double resultUnboxed = getDoubleObject(); // Auto - Unboxing
        Double resultBoxed = getDoublePrimitive(); // Auto - Boxing

        Integer[] wrapperArray = new Integer[5]; // Array of Wrapper

        wrapperArray[0] = 50; // Auto - Boxing

        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        /**
         * Character - char
         */
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'}; // Auto-boxing - Array of Wrapper
        System.out.println(Arrays.toString(charArray));

        System.out.println(returnAnInt(testBoxedInt));
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getDoublePrimitive(){
        return 100.00;
    }

    private static int returnAnInt(Integer i){ // unboxing
        return i;
    }
}