package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numberOfStars; i++){
            sb.append('*');
        }
        return sb.toString();
    }

    public static String getTriangle(int numberOfRows) {
        // we need to produce numberOfRows - 1 actual rows
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < numberOfRows; i++){
           // sb.append(getRow(i));
            // sb.append("\n");
            sb.append(getRow(i)).append("\n");
        }
        return sb.toString();

    }

    // hmm
    
    public static String getSmallTriangle() {

        return getTriangle(5);
    }

    public static String getLargeTriangle() {

        return getTriangle(10);
    }
}
