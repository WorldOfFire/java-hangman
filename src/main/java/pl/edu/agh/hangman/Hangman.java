package pl.edu.agh.hangman;

public class Hangman {


    public static void main(String[] args) {
        //Testy
        //Logika gry na danych statycznych
        //------------------------------------------------------------------------
//        LogicGame logicGame = new LogicGame("barbara");
//        char[] currentCharArray  = new char[logicGame.getWordCharArray().length];
//        for (int i = 0; i < logicGame.getWordCharArray().length; i++){
//            currentCharArray[i] = '-';
//        }
//
//        System.out.println(currentCharArray);
//
//        char guess = 'z';
//        System.out.println(logicGame.isGuessCorrect(guess, currentCharArray));
//        System.out.println(currentCharArray);
//
//        char guess2 = 'b';
//        System.out.println(logicGame.isGuessCorrect(guess2, currentCharArray));
//        System.out.println(currentCharArray);
//
//        char guess3 = 'r';
//        System.out.println(logicGame.isGuessCorrect(guess3, currentCharArray));
//        System.out.println(currentCharArray);
        //------------------------------------------------------------------------

        new Interface().interfaceGameStart();

    }
}
