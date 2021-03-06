package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;
import java.util.Scanner;

public class Game {

    private int randomNumber;
    private int guess;
    private Scanner scan = new Scanner(System.in);

    public Game() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;
    }

    public void start(){
        displayGameText(GameDisplayText.instructions);
        guess = Integer.parseInt(scan.next());

        while(!guessCorrect()){
            analyzeGuess(guess);
            guess = Integer.parseInt(scan.next());
        }
        displayGameText(GameDisplayText.win);
    }

    private void analyzeGuess(int guess) {
        if(guess < randomNumber)
            displayGameText(GameDisplayText.guessTooLow);
        else
            displayGameText(GameDisplayText.guessTooHigh);
    }

    private boolean guessCorrect(){
        return guess == randomNumber;
    }

    private void displayGameText(String text){
        System.out.println(text);
    }
}
