package pl.edu.agh.hangman;

public class SLWP implements WordProvider {
    WordProvider wordProvider;
    int wordLength;

    public SLWP(WordProvider wordProvider, int wordLength) {
        this.wordProvider = wordProvider;
        this.wordLength = wordLength;
    }

    @Override
    public String getRandom() {
        String slowo;
        do {
            WordProvider wordProvider1 = wordProvider;
            slowo = wordProvider1.getRandom();
        }
        while (slowo.length()!=wordLength);
        return slowo;
    }
}
