package pl.edu.agh.hangman;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWordProvider implements WordProvider {
    @Override
    public String getRandom() {
        Random random = new Random();
        List<String> words = new ArrayList<>();
        InputStream is = getClass().getClassLoader().getResourceAsStream("slowa.txt");
        try (InputStreamReader streamReader =
                     new InputStreamReader(is, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {

            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line);
            }

            String randomWord = words.get((int) random.nextInt(words.size()));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return words.get(random.nextInt(words.size()));
    }
}
