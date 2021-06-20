import org.junit.Assert;
import org.junit.Test;
import pl.COI.zadanie9.Zad9;

public class Zad9Test {

    @Test
    public void shouldReturnTrue() {
        var firstWord = "naam";
        var secondWord = "man";
        Assert.assertTrue(Zad9.check(Zad9.split(firstWord), Zad9.split(secondWord)));
    }

    @Test
    public void shouldReturnFalse() {
        var firstWord = "naat";
        var secondWord = "man";
        Assert.assertFalse(Zad9.check(Zad9.split(firstWord), Zad9.split(secondWord)));
    }


}
