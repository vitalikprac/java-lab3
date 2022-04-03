import org.junit.*;


public class Task5Test {
    @Test
    public void encryptSomeText() {
        var encryptedText = Task5.encryptText("Перевірка шифрування",3);
        Assert.assertEquals("Тзуздкунг юйчуцдгррв", encryptedText);
    }

    @Test
    public void encryptAlphabet() {
        var encryptedText = Task5.encryptText("абвгґдеєжзиіїйклмнопрстуфхцчшщьюя",5);
        Assert.assertEquals("деєжзиіїйклмнопрстуфхцчшщьюяабвгґ", encryptedText);
    }

    @Test
    public void encryptZeroKey() {
        var encryptedText = Task5.encryptText("Привіт",0);
        Assert.assertEquals("Привіт", encryptedText);
    }

    @Test
    public void encryptTextWithSymbols() {
        var encryptedText = Task5.encryptText("Привіт ;123456789_$^-,,,,...",1);
        Assert.assertEquals("Рсігїу ;123456789_$^-,,,,...", encryptedText);
    }

    @Test
    public void encryptTextWithNegativeKey() {
        var encryptedText = Task5.encryptText("абв",-1);
        Assert.assertEquals("яаб", encryptedText);
    }


    @Test
    public void decryptSomeText() {
        var decryptedText = Task5.decryptText("Тзуздкунг юйчуцдгррв",3);
        Assert.assertEquals("Перевірка шифрування", decryptedText);
    }

    @Test
    public void decryptAlphabet() {
        var decryptedText = Task5.decryptText("деєжзиіїйклмнопрстуфхцчшщьюяабвгґ",5);
        Assert.assertEquals("абвгґдеєжзиіїйклмнопрстуфхцчшщьюя", decryptedText);
    }

    @Test
    public void decryptZeroKey() {
        var decryptedText = Task5.decryptText("Привіт",0);
        Assert.assertEquals("Привіт", decryptedText);
    }

    @Test
    public void decryptTextWithSymbols() {
        var decryptedText = Task5.decryptText("Рсігїу ;123456789_$^-,,,,...",1);
        Assert.assertEquals("Привіт ;123456789_$^-,,,,...", decryptedText);
    }

    @Test
    public void decryptTextWithNegativeKey() {
        var decryptedText = Task5.decryptText("яаб",-1);
        Assert.assertEquals("абв", decryptedText);
    }




}