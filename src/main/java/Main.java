import validators.Vocabulary;

import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:/vocabulary.txt");
        Vocabulary vocabulary = new Vocabulary();
        vocabulary.addTranslationFile(file);
        vocabulary.addTranslationFile(file);
        vocabulary.printTranslation("Window");
    }

}
