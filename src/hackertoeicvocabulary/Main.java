package hackertoeicvocabulary;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Word> words=Controller.readFile("hackertoeicvocabulary/original/10_CB.txt");
        Controller.writeFileJson(words,"hackertoeicvocabulary/json/10_CB.json");
    }
}
