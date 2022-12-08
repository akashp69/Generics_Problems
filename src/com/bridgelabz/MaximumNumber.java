package com.bridgelabz;

public class MaximumNumber <T extends Comparable>{
    /**
     * Using the Three Instance variables
     */
    T var1, var2, var3;

    /**
     *This is Non-Static Method
     */
    public MaximumNumber(T var1, T var2, T var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    /**
     * This is method used for storing  values and comapring
     */
    public void max() {
        MaximumNumber.getMaximum(var1, var2, var3);
    }

    /**
     *This is a generic Method Is Used for the getting the maximum integer,float and string
     */
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
     *This is Main Method Is Used For Call the methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        Integer a = 25, b = 50, c =100;
        Float x = 15.2f, y = 15.8f, z = 15.6f;
        String j = "Apple", k = "Peach" , l = "Banana";
        System.out.println(a);
        System.out.println(c);
        System.out.println(a);
        System.out.println("******Maximum Integer******");
        new MaximumNumber<>(a, b, c).max();
        System.out.println("\n");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println("********Maximum float******");
        new MaximumNumber<>(x, y, z).max();
        System.out.println("\n");
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println("******Maximum string********");
        new MaximumNumber<>(j, k, l).max();

    }

}
