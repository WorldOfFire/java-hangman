package pl.edu.agh.hangman;

import java.util.Scanner;

public class Interface {

    public void gameStart() {
        WordProvider wordProvider = new WordProvider();
        String randomWord = wordProvider.getRandom();
        System.out.println(randomWord);

        LogicGame logicGame = new LogicGame(randomWord.toLowerCase());
        char[] currentCharArray  = new char[logicGame.getWordCharArray().length];
        for (int i = 0; i < logicGame.getWordCharArray().length; i++){
            currentCharArray[i] = '-';
        }
        System.out.println(currentCharArray);

        int chancesCounter = 0;
        while (chancesCounter < 7) {
            char yourGuess = wordScanner();
            System.out.println(yourGuess);

            System.out.println(logicGame.isGuessCorrect(yourGuess, currentCharArray));
            System.out.println(currentCharArray);
            if (!logicGame.isGuessCorrect(yourGuess, currentCharArray)) {
                HangmanPics hangmanPics = new HangmanPics();
                hangmanPics.getHangmanpics();
                System.out.println();
                chancesCounter++;

            }
        }
    }

    public char wordScanner() {
        Scanner scanner = new Scanner(System.in);
        char guess = scanner.next().charAt(0);
        return guess;
    }

    public void interfaceGameStart(){
        System.out.println("Welcome to Hangman!");
        System.out.println("Zasady gry ...");
        System.out.println("<Guess>");

        gameStart();
    }


}
