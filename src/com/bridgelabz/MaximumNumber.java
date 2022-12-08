package com.bridgelabz;


public class MaximumNumber {

    private static <T extends Comparable> void getMaximum(T a, T b, T c) {
        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        System.out.println("Maximum :" + max);
    }

    /**
     *This is Main Method is Used for calling the Generic method
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 25, b = 50, c = 100;
        Float x = 15.2f, y = 15.8f, z = 15.6f;
        String j = "Apple", k = "Peach" , l = "Banana";
        System.out.println(a);
        System.out.println(c);
        System.out.println(a);
        System.out.println("******Maximum Integer******");
        MaximumNumber.getMaximum(a, b, c);
        System.out.println("\n");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("********Maximum float******");
        MaximumNumber.getMaximum(x, y, z);
        System.out.println("\n");
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println("******Maximum string********");
        MaximumNumber.getMaximum(j, k, l);
    }

}
