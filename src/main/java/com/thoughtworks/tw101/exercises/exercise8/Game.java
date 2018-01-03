package com.thoughtworks.tw101.exercises.exercise8;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private int randomNumber;
    private int guess;
    private ArrayList<Integer> guesses;
    private Scanner scan = new Scanner(System.in);

    public Game() {
        Random rand = new Random();
        randomNumber = rand.nextInt(100) + 1;
        guesses = new ArrayList<>();
    }

    public void start(){
        displayGameText(GameDisplayText.getInstructions());
        getNextGuess();

        while(!guessCorrect()){
            analyzeGuess(guess);
            getNextGuess();
        }
        displayGameText(GameDisplayText.getWin());
        displayGuesses();
    }

    public void getNextGuess() {
        try{
            guess = Integer.parseInt(scan.next());
            guesses.add(guess);
        }catch (NumberFormatException e){
            System.out.println("Please enter an integer");
            getNextGuess();
        }
    }

    private void analyzeGuess(int guess) {
        if(guess < randomNumber)
            displayGameText(GameDisplayText.getGuessTooLow());
        else
            displayGameText(GameDisplayText.getGuessTooHigh());
    }

    private void displayGuesses(){
        for (int guess: guesses) {
            System.out.print(guess + " ");
        }
    }

    private boolean guessCorrect(){
        return guess == randomNumber;
    }

    private void displayGameText(String text){
        System.out.println(text);
    }
}
