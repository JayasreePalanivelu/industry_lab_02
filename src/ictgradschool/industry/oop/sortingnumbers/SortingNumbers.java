package ictgradschool.industry.oop.sortingnumbers;

import ictgradschool.Keyboard;

/**
 * Write a program that prompts the user to enter a range – 2 integers representing a lower bound and an upper bound.
 * You should use Keyboard.readInput() for this. Then, convert these bounds from String to int using Integer.parseInt().
 * Your program should then use Math.random() to generate 3 random integers that lie between the range entered (inclusive),
 * and then use Math.min() to determine which of the random integers is the smallest.
 */
public class SortingNumbers {

    /**
     * TODO Your code here. You may also write additional methods if you like.
     */
    private void start() {
        System.out.println("print your lower bound values");
        int lowerBound= Integer.parseInt(Keyboard.readInput());
        System.out.println("print your upper bound values");
        int upperBound= Integer.parseInt(Keyboard.readInput());
        int randomNumber1=(int)Math.floor(Math.random()*(upperBound-lowerBound+1)+lowerBound);
        int randomNumber2=(int)Math.floor(Math.random()*(upperBound-lowerBound+1)+lowerBound);
        int randomNumber3=(int)Math.floor(Math.random()*(upperBound-lowerBound+1)+lowerBound);
        System.out.println("Three random numbers are: " +randomNumber1+ " "+ randomNumber2 + " "+randomNumber3);
        System.out.println("smallest number " + Math.min(randomNumber1, (Math.min(randomNumber2,randomNumber3))));
    }


    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        SortingNumbers ex = new SortingNumbers();
        ex.start();

    }
}
