import java.util.*;

/**
 * 13.	Створіть програму, яка здійснює шифрування/розшифрування методом простої заміни.
 *      У ньому кожен символ незашифрованого тексту з вихідного алфавіту замінюється іншим з алфавіту,
 *      символи в якому представлені відповідно до ключа шифрування.
 */
public class Task13 {
    public static final String ALPHABET  = "abcdefghijklmnopqrstuvwxyz";

    public static void execute(String[] args) {
        var cryptoKey = args[1];
        var keySet = new HashSet<>(cryptoKey.chars().mapToObj(e -> (char) e).toList());
        if (cryptoKey.length() != ALPHABET.length() || keySet.size() != ALPHABET.length()){
            System.out.println("[TASK13] Incorrect key!");
            return;
        }
        var text = String.join(" ", Arrays.stream(args).toList().subList(2, args.length));
        System.out.println("[TASK13] Original message: "+text);
        var encryptedText = encryptText(text,cryptoKey);
        System.out.println("[TASK13] Encrypted message with key ("+cryptoKey+"): "+encryptedText);
        var decryptedText = decryptText(encryptedText,cryptoKey);
        System.out.println("[TASK13] Decrypted message with key ("+cryptoKey+"): "+decryptedText);
    }

    public static String encryptText(String text, String key){
        return cryptText(text, key,true);
    }

    public static String decryptText(String text, String key){
        return cryptText(text, key,false);
    }

    private static String cryptText(String text, String key, boolean isEncrypt){
        StringBuilder codedText = new StringBuilder();
        for (var i = 0; i < text.length(); i++){
            String letter = String.valueOf(text.charAt(i));
            String dict = isEncrypt ? ALPHABET: key;
            var index = dict.indexOf(letter.toLowerCase(Locale.ROOT));
            if (index == -1){
                codedText.append(letter);
            }else {
                String dictDecrypt = isEncrypt ? key: ALPHABET;
                var cryptLetter = String.valueOf(dictDecrypt.charAt(index));
                if (Character.isLowerCase(letter.charAt(0))){
                    codedText.append(cryptLetter);
                }else{
                    codedText.append(cryptLetter.toUpperCase(Locale.ROOT));
                }
            }
        }
        return codedText.toString();
    }
}
