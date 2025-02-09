package pl.edu.agh.hangman;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordProvider {
    public void getRandom(){
        Random random = new Random();
        List<String> words = new ArrayList<>();
        InputStream is = getClass().getClassLoader().getResourceAsStream("slowa.txt");
        try (InputStreamReader streamReader =
                     new InputStreamReader(is, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                words.add(line);
            }

            System.out.println(words.size());
            String randomWord = words.get((int)random.nextInt(words.size()));
            System.out.println(randomWord);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
