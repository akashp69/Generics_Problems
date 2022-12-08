package com.bridgelabz;

public class MaximumNumber <T>{
    /**
     *This is Generic Method is Using for take more than 3 parameters
     */
    public static <T extends  Comparable <T>>  T maximumValue( T val1 , T val2, T val3 ,T val4,T val5) {
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        System.out.println(val4);
        System.out.println(val5);
         T max = val1;
        if (val2.compareTo(max) > 0 ) {
            max = val2;
        } if (val3.compareTo(max) > 0){
            max = val3;
        }if (val4.compareTo(max) > 0 ){
            max = val4;
        }if (val5.compareTo(max) > 0){
            max = val5;
        }
        return max;
    }

    /**
     *This is Main Method Is used for the calling the methods
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Generic Program.");
        System.out.println( "The maximum value is :: "+maximumValue(3,3,6,7,1));
    }
}

