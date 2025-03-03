package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static String getExponentiations(int start, int stop, int step, int exponent) {

        StringBuilder sb = new StringBuilder();
        while( start < stop ){
            sb.append((int) Math.pow(start,exponent));
            start = start + step;
        }
        return sb.toString();
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

    public static boolean isNumberEven(int toTest) {
        return (toTest % 2) == 0;
    }
    public static boolean isNumberOdd(int toTest) {
        return (toTest % 2) == 1;
    }

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        while( start < stop ){
            if(isNumberEven(start)) {
                sb.append(start);
            }
            start = start + 1;
        }
        return sb.toString();
    }

    public static String getOddNumbers(int start, int stop) {
        StringBuilder sb = new StringBuilder();
        while( start < stop ){
            if(isNumberOdd(start)) {
                sb.append(start);
            }
            start = start + 1;
        }
        return sb.toString();
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return NumberUtilities.getExponentiations(start, stop,step,2);
    }

}
