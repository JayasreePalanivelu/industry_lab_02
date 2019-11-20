package ictgradschool.industry.oop.luckynumbers;

/**
 * Write a program which generates 2 random integers between 25 and 30 (inclusive),
 * then uses Math.min() and Math.max() to display them in descending sequence.
 */
public class LuckyNumbers {
    /**
     * TODO Your code here. You may also write additional methods if you like.
     */
    private void start() {
      final  int UPPER=30;
      final int LOWER=25;

        int num1=(int)(Math.random()*(UPPER-LOWER+1)+LOWER);
        int num2=(int)(Math.random()*(UPPER-LOWER+1)+LOWER);
        System.out.println("lucky num "+Math.max(num1,num2) + " and " + Math.min(num1,num2));
    }

    /**
     * Program entry point. Do not edit.
     */
    public static void main(String[] args) {

        LuckyNumbers ex = new LuckyNumbers();
        ex.start();

    }
}
