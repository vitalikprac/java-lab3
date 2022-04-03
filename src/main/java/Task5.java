import java.util.Arrays;
import java.util.Locale;

/**
 * 5.	Створіть програму для шифрування\розшифровки тексту методом Цезаря.
 *      У ньому ключем є ціле число, а шифрування\ розшифровка полягає в
 *      сумовуванні\відніманні кодів символів відкритого
 *      тексту\криптотексту з ключем.
 */
public class Task5 {

    public static final String ALPHABET  = "abcdefghijklmnopqrstuvwxyz";

    public static void execute(String[] args) {
        var cryptoKey = Integer.parseInt(args[1]);
        var text = String.join(" ",Arrays.stream(args).toList().subList(2, args.length));
        System.out.println("[TASK5] Original text: "+text);
        var encryptedText = encryptText(text,cryptoKey);
        System.out.println("[TASK5] Encrypted text with key ("+cryptoKey+"): "+encryptedText);
        var decryptedText = decryptText(encryptedText,cryptoKey);
        System.out.println("[TASK5] Decrypted text with key ("+cryptoKey+"): "+decryptedText);
    }

    public static String encryptText(String text, int key){
        return cryptText(text, key,true);
    }

    public static String decryptText(String text, int key){
        return cryptText(text, key,false);
    }

    private static String cryptText(String text, int key, boolean isEncrypt){
        StringBuilder codedText = new StringBuilder();
        for (var i = 0; i < text.length(); i++){
            String letter = String.valueOf(text.charAt(i));
            var index = ALPHABET.indexOf(letter.toLowerCase(Locale.ROOT));
            if (index == -1){
                codedText.append(letter);
            }else {
                var cryptIndex = isEncrypt ? (index + key) : (index - key);
                cryptIndex = cryptIndex % ALPHABET.length();
                if (cryptIndex < 0){
                    cryptIndex = ALPHABET.length()+cryptIndex;
                }
                String cryptoLetter = String.valueOf(ALPHABET.charAt(cryptIndex));
                if (Character.isLowerCase(letter.charAt(0))){
                    codedText.append(cryptoLetter);
                }else{
                    codedText.append(cryptoLetter.toUpperCase(Locale.ROOT));
                }
            }
        }
        return codedText.toString();
    }

}