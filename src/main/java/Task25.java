import java.util.Arrays;
import java.util.List;


/**
 * 25.	Аналіз аргументів, що задаються під час запуску програми.
 * Програма шукає найбільший рядок, що міститься у введених аргументах
 * (шаблон аргументу: рядок або латинських букв, або букв кирилиці).
 * Програма виводить кількість заданих аргументів, їх значення і
 * найбільший рядок або повідомлення про те, що такого немає.
 */
public class Task25 {
    public static void execute(String[] args) {
        var texts = Arrays.stream(args).toList().subList(1, args.length);

        System.out.println("[TASK25] Count of arguments: " + texts.size());
        printTexts(texts);
        var largestText = getLargestText(texts);
        if (largestText.length() == 0) {
            System.out.println("[TASK25] The largest text not found");
            return;
        }
        System.out.println("[TASK25] The largest text: " + largestText);
    }

    public static void printTexts(List<String> texts) {
        for (int i =0;i<texts.size(); i++) {
            System.out.println("[TASK25] Argument " + (i+1) + " value: " + texts.get(i));
        }
    }

    public static String getLargestText(List<String> texts) {
        String largestText = "";
        for (var text : texts) {
            if (text.length() > largestText.length()) {
                largestText = text;
            }
        }
        return largestText;
    }
}
