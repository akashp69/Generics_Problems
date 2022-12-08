package com.bridgelabz;

public class MaximumNumber {
    /**
     *This is Static Method used for Find the maximum float value
     */
    private static void testMaximum(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum num is:" + max);
    }

    /**
     *This is Main Method is used for calling the static methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Float a = 15.2f, b= 15.8f, c = 15.6f;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        testMaximum(a, b, c); 	}
}