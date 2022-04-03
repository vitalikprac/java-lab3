import java.util.*;


/**
 * 25.	Аналіз аргументів, що задаються під час запуску програми.
 *      Програма сортує введені аргументи (шаблон аргументу: рядок латинських букв) по першому символу аргументу.
 *      Програма виводить кількість заданих параметрів, їх значення і список відсортованих аргументів.
 */

public class Task31 {
    public static void execute(String[] args) {
        var texts = Arrays.stream(args).toList().subList(1, args.length);
        System.out.println("[TASK31] Count of arguments: " + texts.size());
        printTexts(texts);
        var sortedTexts = sortTexts(texts);
        if (texts.size() ==0) {
            System.out.println("[TASK31] List of sorted arguments is empty!");
        }else{
            System.out.println("[TASK31] List of sorted arguments: " + String.join(", ", sortedTexts));
        }
    }

    public static void printTexts(List<String> texts) {
        for (int i =0;i<texts.size(); i++) {
            System.out.println("[TASK31] Argument " + (i+1) + " value: " + texts.get(i));
        }
    }

    public static List<String> sortTexts(List<String> texts) {
        List<String> modifiableList = new ArrayList<>(texts);
        modifiableList.sort(Comparator.comparingInt(a -> a.charAt(0)));
        return modifiableList;
    }
}
