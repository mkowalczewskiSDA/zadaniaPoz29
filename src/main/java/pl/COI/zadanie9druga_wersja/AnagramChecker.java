package pl.COI.zadanie9druga_wersja;

import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TransferQueue;

public class AnagramChecker {

    public boolean checkForAnagram(String firstWord, String secondWord) {

        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        //Jeżeli chcemy sprawdzać nie zwracając uwagi na wielkość liter
        //powinniśmy tutaj dodać .toLowerCase() albo toUpperCase()
        Map<Character, Integer> firstWordMap = fillMap(firstWord);
        Map<Character, Integer> secondWordMap = fillMap(secondWord);

        for (Map.Entry<Character, Integer> entry:firstWordMap.entrySet()) {
            if (secondWordMap.containsKey(entry.getKey())) {
                if (!entry.getValue().equals(secondWordMap.get(entry.getKey()))) {
                    return false;
                }
            } else {
               return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> fillMap(String word) {
        Map<Character, Integer> wordMap = new TreeMap<>();
        var charArray = word.toCharArray();
        for (char c : charArray) {
            //wordMap.merge(c, 1, Integer::sum); - można też tak
            if (wordMap.get(c) == null) {
                wordMap.put(c, 1);
            } else {
                wordMap.put(c, wordMap.get(c)+1);
            }
        }
        return wordMap;
    }



}
