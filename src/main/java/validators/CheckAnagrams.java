package validators;

import java.util.HashMap;
import java.util.Map;

public class CheckAnagrams {
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
                if(mapOfCharactersOfStr2.get(c)==1){
                    mapOfCharactersOfStr2.remove(c);
                }else {
                    mapOfCharactersOfStr2.put(c, mapOfCharactersOfStr2.get(c) - 1);
                }
                isAnagram = true;
            } else {
                isAnagram = false;
            }
        }
        return isAnagram;
    }
}
