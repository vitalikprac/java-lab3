import org.junit.Assert;
import org.junit.Test;


public class Task13Test {
    private static final String KEY = "сйешмґциюжївзблчпщактєгхфуьянроід";

    @Test
    public void encryptSomeText() {
        var encryptedText = Task13.encryptText("Перевірка шифрування",KEY);
        Assert.assertEquals("Кцтцевтлс нїфтхесщщд", encryptedText);
    }

    @Test
    public void encryptAlphabet() {
        var encryptedText = Task13.encryptText("абвгґдеєжзиіїйклмнопрстуфхцчшщьюя",KEY);
        Assert.assertEquals(KEY, encryptedText);
    }

    @Test
    public void encryptSameKey() {
        var encryptedText = Task13.encryptText("Привіт","абвгґдеєжзиіїйклмнопрстуфхцчшщьюя");
        Assert.assertEquals("Привіт", encryptedText);
    }

    @Test
    public void encryptTextWithSymbols() {
        var encryptedText = Task13.encryptText("Привіт ;123456789_$^-,,,,...",KEY);
        Assert.assertEquals("Ктїевг ;123456789_$^-,,,,...", encryptedText);
    }


    @Test
    public void decryptSomeText() {
        var decryptedText = Task13.decryptText("Кцтцевтлс нїфтхесщщд",KEY);
        Assert.assertEquals("Перевірка шифрування", decryptedText);
    }

    @Test
    public void decryptAlphabet() {
        var decryptedText = Task13.decryptText(KEY,KEY);
        Assert.assertEquals("абвгґдеєжзиіїйклмнопрстуфхцчшщьюя", decryptedText);
    }

    @Test
    public void decryptSameKey() {
        var decryptedText = Task13.decryptText("Привіт","абвгґдеєжзиіїйклмнопрстуфхцчшщьюя");
        Assert.assertEquals("Привіт", decryptedText);
    }

    @Test
    public void decryptTextWithSymbols() {
        var decryptedText = Task13.decryptText("Ктїевг ;123456789_$^-,,,,...",KEY);
        Assert.assertEquals("Привіт ;123456789_$^-,,,,...", decryptedText);
    }

}