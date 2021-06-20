package pl.COI.zadanie9druga_wersja;

public class Zadanie9new {

    public static void main(String[] args) {
        AnagramChecker checker = new AnagramChecker();
        String firstWord = "Teste";
        String secondWord = "testt";
        System.out.println(checker.checkForAnagram(firstWord, secondWord));

    }
}
