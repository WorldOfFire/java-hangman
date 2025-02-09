package pl.edu.agh.hangman;

public class LogicGame {
    private String word;
    private char[] wordCharArray;
    private char guess;

    public LogicGame(String word) {
        this.word = word;
        this.wordCharArray = word.toCharArray();
    }

    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public char[] getWordCharArray() {
        return wordCharArray;
    }
    public void setWordCharArray(char[] wordCharArray) {
        this.wordCharArray = wordCharArray;
    }
    public char getGuess() {
        return guess;
    }
    public void setGuess(char guess) {
        this.guess = guess;
    }

    public boolean isGuessCorrect(char guess, char... currentCharArray) {
        int liczba = 0;
        int numberToChange = 0;

        for (char letter : wordCharArray) {
            if (letter == guess) {
                liczba++;
                currentCharArray[numberToChange] = letter;
            }
            numberToChange++;
        }
        return liczba != 0;
    }
}
