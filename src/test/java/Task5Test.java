import org.junit.*;


public class Task5Test {
    @Test
    public void encryptSomeText() {
        var encryptedText = Task5.encryptText("Test encryption",3);
        Assert.assertEquals("Whvw hqfubswlrq", encryptedText);
    }

    @Test
    public void encryptAlphabet() {
        var encryptedText = Task5.encryptText("abcdefghijklmnopqrstuvwxyz",5);
        Assert.assertEquals("fghijklmnopqrstuvwxyzabcde", encryptedText);
    }

    @Test
    public void encryptZeroKey() {
        var encryptedText = Task5.encryptText("Hello",0);
        Assert.assertEquals("Hello", encryptedText);
    }

    @Test
    public void encryptTextWithSymbols() {
        var encryptedText = Task5.encryptText("Hello ;123456789_$^-,,,,...",1);
        Assert.assertEquals("Ifmmp ;123456789_$^-,,,,...", encryptedText);
    }

    @Test
    public void encryptTextWithNegativeKey() {
        var encryptedText = Task5.encryptText("abc",-1);
        Assert.assertEquals("zab", encryptedText);
    }


    @Test
    public void decryptSomeText() {
        var decryptedText = Task5.decryptText("Whvw hqfubswlrq",3);
        Assert.assertEquals("Test encryption", decryptedText);
    }

    @Test
    public void decryptAlphabet() {
        var decryptedText = Task5.decryptText("fghijklmnopqrstuvwxyzabcde",5);
        Assert.assertEquals("abcdefghijklmnopqrstuvwxyz", decryptedText);
    }

    @Test
    public void decryptZeroKey() {
        var decryptedText = Task5.decryptText("Hello",0);
        Assert.assertEquals("Hello", decryptedText);
    }

    @Test
    public void decryptTextWithSymbols() {
        var decryptedText = Task5.decryptText("Ifmmp ;123456789_$^-,,,,...",1);
        Assert.assertEquals("Hello ;123456789_$^-,,,,...", decryptedText);
    }

    @Test
    public void decryptTextWithNegativeKey() {
        var decryptedText = Task5.decryptText("zab",-1);
        Assert.assertEquals("abc", decryptedText);
    }




}