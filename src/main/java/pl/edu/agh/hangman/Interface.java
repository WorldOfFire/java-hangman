package pl.edu.agh.hangman;

import java.util.Scanner;

public class Interface {

    public void gameStart() {
        System.out.println("Welcome to Hangman!");
        System.out.println("<Guess>");
        WordProvider wordProvider = new WordProvider();
        String randomWord = wordProvider.getRandom();
        System.out.println(randomWord);
        LogicGame logicGame = new LogicGame("barbara");
        char[] currentCharArray  = new char[logicGame.getWordCharArray().length];
        for (int i = 0; i < logicGame.getWordCharArray().length; i++){
            currentCharArray[i] = '-';
        }
        System.out.println(currentCharArray);

    }

    public char[] wordScanner() {

        char[] guessChars = new char[2];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgaduje literke-wybierz 1");
        System.out.println("Znam całe słowo!- wybierz 2");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Wpisz literkę:");
                char guess = scanner.next().charAt(0);

            case 2:
                System.out.println("Wpisz słowo:");
                int wordLenght = wordProvider.getLenght();
                for (int i = 0; i < wordLenght; i++) {
                    char[] guessedWord = scanner.next().toCharArray();
                }
        }
return guessChars;
    }
}
