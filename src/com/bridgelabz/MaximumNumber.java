package com.bridgelabz;

public class MaximumNumber {
    /**
     *This is Static  Method is Used For comparing  the strings
     */
    private static void testMaximum(String j,String k,String l) {
        String max = j;
        if (k.compareTo(j) > 0) {
            max = k;
        }
        if (l.compareTo(max) > 0) {
            max = l;
        }
        System.out.println("Maximum string is:" + max);
    }

    /**
     *This is Main Method is Used For call the Static Methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        String j = "Apple", k = "Peach" , l = "Banana";
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        testMaximum(j, k, l);
    }
}
