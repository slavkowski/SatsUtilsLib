package validators;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vocabulary {
    private Map<String, List<String>> vocabulary = new HashMap<>();

    public void addTranslationFile(File file) {
        String line;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            while ((line = bf.readLine()) != null) {
                String[] spliitedRow = line.split(",");
                List<String> values = new ArrayList<>();
                for (int i = 1; i < spliitedRow.length; i++) {
                    values.add(spliitedRow[i].trim());
                }
                addToList(spliitedRow[0].trim(),values);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addToList(String key, List<String> values) {
        if (vocabulary.containsKey(key)){
            vocabulary.get(key).addAll(values);
        }else{
            vocabulary.put(key, values);
        }
    }

    public void printTranslation(String key) {
        vocabulary.get(key).forEach(System.out::println);
    }
}
