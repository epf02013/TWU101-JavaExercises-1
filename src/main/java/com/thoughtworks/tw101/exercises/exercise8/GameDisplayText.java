package com.thoughtworks.tw101.exercises.exercise8;

public class GameDisplayText {
    private static String guessTooLow = "Your guess was too low. Enter another number.";
    private static String guessTooHigh = "Your guess was too high. Enter another number.";
    private static String win = "You win!";
    private static String instructions = "Enter a number between 1 and 100. If you guess the correct number you win!";

    public static String getGuessTooLow() {
        return guessTooLow;
    }

    public static void setGuessTooLow(String guessTooLow) {
        GameDisplayText.guessTooLow = guessTooLow;
    }

    public static String getGuessTooHigh() {
        return guessTooHigh;
    }

    public static void setGuessTooHigh(String guessTooHigh) {
        GameDisplayText.guessTooHigh = guessTooHigh;
    }

    public static String getWin() {
        return win;
    }

    public static void setWin(String win) {
        GameDisplayText.win = win;
    }

    public static String getInstructions() {
        return instructions;
    }

    public static void setInstructions(String instructions) {
        GameDisplayText.instructions = instructions;
    }
}
