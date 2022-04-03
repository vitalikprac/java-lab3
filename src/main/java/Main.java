/**
 * Варіант - 16
 * Завдання 5,13,25,31
 */
public class Main {
    public static void main(String[] args) throws Exception {
        var taskExecute = args[0];
        switch (taskExecute) {
            case "task5" -> Task5.execute(args);
            case "task13" -> Task13.execute(args);
            /*
            case "task25" -> Task25.execute(args);
            case "task31" -> Task31.execute(args);*/
            default -> {
                throw new Exception("No specific task argument passed");
            }
        }
    }
}