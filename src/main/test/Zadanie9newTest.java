import org.junit.Assert;
import org.junit.Test;
import pl.COI.zadanie9druga_wersja.AnagramChecker;


public class Zadanie9newTest {

    @Test
    public void shouldReturnTrue() {
        var firstWord = "test";
        var secondWord = "estt";
        AnagramChecker checker = new AnagramChecker();
        Assert.assertTrue(checker.checkForAnagram(firstWord,secondWord));
    }

    @Test
    public void shouldReturnFalse() {
        var firstWord = "Test";
        var secondWord = "estt";
        AnagramChecker checker = new AnagramChecker();
        Assert.assertFalse(checker.checkForAnagram(firstWord,secondWord));
        firstWord = "tes";
        secondWord = "estt";
        Assert.assertFalse(checker.checkForAnagram(firstWord,secondWord));
        firstWord = "tesy";
        secondWord = "estt";
        Assert.assertFalse(checker.checkForAnagram(firstWord,secondWord));
    }

}
