package validators;

import exceptions.WrongLengthException;
import temp.ArrayUtils;

public class Main {
    public static void main(String[] args) {
        CheckAnagrams checkAnagrams = new CheckAnagrams();
        System.out.println(checkAnagrams.checkIfStr1IsAnagramOfStr2("wiatr", "klawiatura"));

    }
}
