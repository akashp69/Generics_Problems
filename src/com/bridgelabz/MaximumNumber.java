package com.bridgelabz;

public class MaximumNumber {
    /**
     *This is Static method Used for comparing out of three integer which one is maximum number
     */
    public static void testMaximumNumber(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum Number is:" + max);
    }

    /**
     * This is Main Method is Used for calling the static method
     * Using a,b and c Variables for three integers values
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 25, b = 50, c =100;
        System.out.println("a ="+a);
        System.out.println("b ="+b);
        System.out.println("c ="+c);

        testMaximumNumber (a,b,c);
    }
}
