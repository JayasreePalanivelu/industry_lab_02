package ictgradschool.industry.oop.lowestweight;

import ictgradschool.Keyboard;

/**
 * Write a program which asks the user to enter the weights of two people,
 * then uses Math.min() to determine the lowest weight, and prints out the result.
 */
public class LowestWeight {


    private void start() {
        System.out.println("enters person 1st weight");
        String firstWeight01 = Keyboard.readInput();
        System.out.println("enters person 2nd weight");
        String secondWeight02= Keyboard.readInput();
        double firstWeight=Double.parseDouble(firstWeight01);
        double secondWeight= Double.parseDouble(secondWeight02);
        double lowestweight = Math.min(firstWeight, secondWeight);
        System.out.println("lowest weight"+  lowestweight);
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        LowestWeight ex = new LowestWeight();
        ex.start();

    }
}
