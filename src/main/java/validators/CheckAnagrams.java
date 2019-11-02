package validators;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {

    public boolean checkIfStr1IsAnagramOfStr2NoMapsSolution(String str1, String str2) {
        boolean isAnagram = false;
        for (int i = 0; i < str1.length(); i++) {
            char letter = str1.charAt(i);
            if (letterOccurrenceInWord(letter, str1) > letterOccurrenceInWord(letter, str2)) {
                isAnagram = false;
                break;
            } else {
                isAnagram = true;
            }
        }
        return isAnagram;
    }

    private int letterOccurrenceInWord(char letter, String word) {
        int occurrence = 0;
        for (int i = 0; i < word.length(); i++) {
            if (letter == word.charAt(i)) {
                occurrence++;
            }
        }
        return occurrence;
    }


    public boolean checkIfStr1IsAnagramOfStr2(String str1, String str2) {
        boolean isAnagram = false;
        char[] str1CharArray = str1.toCharArray();
        char[] str2CharArray = str2.toCharArray();
        Map<Character, Integer> mapOfCharactersOfStr2 = new HashMap<>();
        for (char c : str2CharArray) {
            if (mapOfCharactersOfStr2.containsKey(c)) {
                int occurrence = mapOfCharactersOfStr2.get(c);
                mapOfCharactersOfStr2.put(c, occurrence + 1);
            } else {
                mapOfCharactersOfStr2.put(c, 1);
            }
        }
        for (char c : str1CharArray) {
            if (mapOfCharactersOfStr2.containsKey(c)) {
                if (mapOfCharactersOfStr2.get(c) == 1) {
                    mapOfCharactersOfStr2.remove(c);
                } else {
                    mapOfCharactersOfStr2.put(c, mapOfCharactersOfStr2.get(c) - 1);
                }
                isAnagram = true;
            } else {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }
}
