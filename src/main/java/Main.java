import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входне данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int max = scanner.nextInt();
        logger.log("Создаем и наполняем список");
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            source.add(random.nextInt(max));
        }
        System.out.println("Вот случайный список: " + source);
        logger.log("Просим ввести пользователя входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int tresholder = scanner.nextInt();
        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(tresholder);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filter.filterOut(source));
        logger.log("Завершаем программу");

    }
}
