package com.bridgelabz;

public class MaximumNumber<T extends Comparable<T>> {
    /**
     * Using 5 instace varibles for storing values
     */
    T val1, val2, val3, val4, val5;

    /**
     *This Method is Used for stored the values in arguments
     */
    public MaximumNumber(T val1, T val2, T val3, T val4, T val5) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
        this.val4 = val4;
        this.val5 = val5;
    }

    /**
     *This method is Used for return the Values which is stored
     */
    public T maximumValue() {
        return maximumValue(val1, val2, val3, val4, val5);

    }

    /**
     *This is Generic Method is Used for comapring the values and getting the maximum
     */
    public static <T extends Comparable<T>> T maximumValue(T val1, T val2, T val3, T val4, T val5) {

        T max = val1;
        if (val2.compareTo(max) > 0) {
            max = val2;
        }
        if (val3.compareTo(max) > 0) {
            max = val3;
        }
        if (val4.compareTo(max) > 0) {
            max = val4;
        }
        if (val5.compareTo(max) > 0) {
            max = val5;
        }
        MaximumNumber.printMax(val1, val2, val3, val4, val5, max);
        return max;
    }
    public static <T> void printMax(T val1, T val2, T val3, T val4, T val5, T max) {
        System.out.println("The maximum of " + val1 + "," + val2 + "," + val3 + "," + val4 + "," + val5
                + " is = " + max);
    }

    /**
     *This is Main Method is Used for calling the methods and finding the maximum
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        maximumValue(3, 3, 6, 7, 1);
        maximumValue(3.5f, 4.7f, 1.2f, 6.8f, 5.5f);
        new MaximumNumber<>(3, 4, 5, 6, 7).maximumValue();
    }
}

