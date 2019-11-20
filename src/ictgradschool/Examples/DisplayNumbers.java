package ictgradschool.Examples;

import ictgradschool.Keyboard;

public class DisplayNumbers {
    public static void main(String[] args) {
        DisplayNumbers displayNumbers = new DisplayNumbers();
        displayNumbers.firstMethod();

    }

    private void firstMethod() {
        System.out.println("welcome");
        int num=getNumberFromUser("Tyne");
        thirdMethod("Tyne", num);
        System.out.println("please enter number for akash");
       int num2= Integer.parseInt(Keyboard.readInput());
        secondMethod(num);
        calculate(num, num2);

    }
    private int getNumberFromUser(String name){
        System.out.println("please enter number for "+ name + "=:");
        int num= Integer.parseInt(Keyboard.readInput());
        return num;
    }
    private void secondMethod(int number){
        System.out.println("akash lucky num " + number);
    }
    private void   thirdMethod(String name,int num){
        System.out.println(name +"lucky number is " + num);

    }
    private void calculate(int num, int num2){
       int addNumbers= num+num2;
        System.out.println("sum of 2 number "+ addNumbers);

    }
}
