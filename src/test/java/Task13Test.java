import org.junit.Assert;
import org.junit.Test;


public class Task13Test {
    private static final String KEY = "azwybtmjnlurkhicvodsfegqpx";

    @Test
    public void encryptSomeText() {
        var encryptedText = Task13.encryptText("Encrypt test",KEY);
        Assert.assertEquals("Bhwopcs sbds", encryptedText);
    }

    @Test
    public void encryptAlphabet() {
        var encryptedText = Task13.encryptText("abcdefghijklmnopqrstuvwxyz",KEY);
        Assert.assertEquals(KEY, encryptedText);
    }

    @Test
    public void encryptSameKey() {
        var encryptedText = Task13.encryptText("Hello","abcdefghijklmnopqrstuvwxyz");
        Assert.assertEquals("Hello", encryptedText);
    }

    @Test
    public void encryptTextWithSymbols() {
        var encryptedText = Task13.encryptText("Hello ;123456789_$^-,,,,...",KEY);
        Assert.assertEquals("Jbrri ;123456789_$^-,,,,...", encryptedText);
    }


    @Test
    public void decryptSomeText() {
        var decryptedText = Task13.decryptText("Bhwopcs sbds",KEY);
        Assert.assertEquals("Encrypt test", decryptedText);
    }

    @Test
    public void decryptAlphabet() {
        var decryptedText = Task13.decryptText(KEY,KEY);
        Assert.assertEquals("abcdefghijklmnopqrstuvwxyz", decryptedText);
    }

    @Test
    public void decryptSameKey() {
        var decryptedText = Task13.decryptText("Hello","abcdefghijklmnopqrstuvwxyz");
        Assert.assertEquals("Hello", decryptedText);
    }

    @Test
    public void decryptTextWithSymbols() {
        var decryptedText = Task13.decryptText("Jbrri ;123456789_$^-,,,,...",KEY);
        Assert.assertEquals("Hello ;123456789_$^-,,,,...", decryptedText);
    }

}