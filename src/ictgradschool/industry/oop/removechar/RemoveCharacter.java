package ictgradschool.industry.oop.removechar;

import ictgradschool.Keyboard;

/**
 * Write a program that prompts the user to enter a sentence, then prints out the sentence with a random character
 * missing. The program is to be written so that each task is in a separate method. See the comments below for the
 * different methods you have to write.
 */
public class RemoveCharacter {

    private void start() {

        String sentence = getSentenceFromUser();

        int randomPosition = getRandomPosition(sentence);

        printCharacterToBeRemoved(sentence, randomPosition);

        String changedSentence = removeCharacter(sentence, randomPosition);

        printNewSentence(changedSentence);
    }

    /**
     * Gets a sentence from the user.
     *
     * @return
     */


    private String getSentenceFromUser() {

        // TODO Prompt the user to enter a sentence, then get their input.

        System.out.println("enter your sentence !");
        String sentence = Keyboard.readInput();
        return sentence;

    }


    /**
     * Gets an int corresponding to a random position in the sentence.
     */
    private int getRandomPosition(String sentence) {

        // TODO Use a combination of Math.random() and sentence.length() to get the desired result.
        int countLetters = sentence.length();

        int randomCharPosition = (int) (Math.random() * (countLetters + 1));
        return randomCharPosition;

    }

    /**
     * Prints a message stating the character to be removed, and its position.
     */
    private void printCharacterToBeRemoved(String sentence, int randomCharPosition) {

        // TODO Implement this method
        char removedLetter = sentence.charAt(randomCharPosition);
        System.out.println("the character " + removedLetter);
    }

    /**
     * Removes a character from the given sentence, and returns the new sentence.
     */
    private String removeCharacter(String sentence, int randomCharPosition) {

        // TODO Implement this method
        String InitialDisplayPosition = sentence.substring(0, randomCharPosition);
        String FinalDisplayString = sentence.substring(randomCharPosition + 1);
        FinalDisplayString = InitialDisplayPosition + FinalDisplayString;
        return FinalDisplayString;
    }

    /**
     * Prints a message which shows the new sentence after the removal has occured.
     */
    private void printNewSentence(String FinalDisplayString) {

        // TODO Implement this method
        System.out.println("Final display:  " + FinalDisplayString);
    }

    public static void main(String[] args) {
        RemoveCharacter ex = new RemoveCharacter();
        ex.start();
    }
}
