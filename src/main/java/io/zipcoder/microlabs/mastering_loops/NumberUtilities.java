package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        return null;
    }

    public static String getRange(int start, int stop, int step) {
        StringBuilder sb = new StringBuilder();
        while( start < stop ){
            sb.append(start);
            start = start + step;
        }
        return sb.toString();
    }

    public static String getRange(int start, int stop) {

        return getRange(start,stop,1);
    }

    public static String getRange(int stop) {

        return getRange(0,stop,1);
    }

    /*
     * natural break
     */

    public static boolean isNumberEven(int toTest) { return false; }
    public static boolean isNumberOdd(int toTest) { return false; }

    public static String getEvenNumbers(int start, int stop) {
        return null;
    }

    public static String getOddNumbers(int start, int stop) {
        return null;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

}
