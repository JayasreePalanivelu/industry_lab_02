package ictgradschool.industry.oop.truncateamount;

import ictgradschool.Keyboard;

/**
 * Write a program that prompts the user to enter an amount and a number of decimal places.  The program should then
 * truncate the amount to the user-specified number of decimal places using String methods.
 *
 * To truncate the amount to the user-specified number of decimal places, the String method indexOf() should be used
 * to find the position of the decimal point, and the method substring() should then be used to extract the amount to
 * the user-specified number of decimal places.  The program is to be written so that each task is in a separate method.
 * You need to write four methods, one method for each of the following tasks:
 *
 * 1. Printing the prompt and reading the amount from the user
 * 2. Printing the prompt and reading the number of decimal places from the user
 * 3. Truncating the amount to the user-specified number of DP's
 * 4. Printing the truncated amount
 *
 */
public class TruncateAmount {

    private void start() {

                // TODO Use other methods you create to implement this program's functionality.
    String amount=getAmountFromUser();
    int numOfPlaces = getNumOfDecimalPlaces();
    printTruncatedAmount(amount, numOfPlaces);
    String truncatedAmount= truncateAmount(amount, numOfPlaces);
    printTruncatedAmount(truncatedAmount,numOfPlaces);
    }

    // TODO Write a method which prompts the user and reads the amount to truncate from the Keyboard
    private  String getAmountFromUser(){
        System.out.println("Please enter amount: ");
        String amount= Keyboard.readInput();
        return  amount;
    }


    // TODO Write a method which prompts the user and reads the number of DP's from the Keyboard
    private int getNumOfDecimalPlaces(){
        System.out.println("enter no of deimal places");
        String dpStr=Keyboard.readInput();
        int dp=Integer.parseInt(dpStr);
        return dp;
    }

    // TODO Write a method which truncates the specified number to the specified number of DP's
    private  String truncateAmount(String amount, int numOfPlaces){
        String truncatedAmount="";
        int index=amount.indexOf(".");
        truncatedAmount = amount.substring(0,index+numOfPlaces+1);

        return  truncatedAmount;
}
    // TODO Write a method which prints the truncated amount
    private void printTruncatedAmount(String amount, int numOfPlaces){
        System.out.println("Amount truncated to " + numOfPlaces + " decimal places: " +amount);
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {
        TruncateAmount ex = new TruncateAmount();
        ex.start();
    }
}
