package com.company;

public class Main {

    public static void main(String[] args) {

            System.out.println("Mean of 1, 1, 3, 3: " + meanCalc(1, 1, 3, 3));
            System.out.println("Mean of 1, 2, 3, 4: " + meanCalc(1, 2, 3, 4));
            System.out.println("Mean of 1, -2, 3, -4: " + meanCalc(1, -2, 3, -4));
            System.out.println("Mean of -1, -11, 24, 2: " + meanCalc(-1, -11, 24, 2));

            System.out.println(" "); //new comment
    }

    public static String meanCalc(int a, int b, int c, int d){
        double mean = (a + b + c + d) /4.0;

        String meanString = Double.toString(mean);

        return meanString;
    }
}
