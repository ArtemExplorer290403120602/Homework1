import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    //Проверить, является ли массив возрастающей последовательностью (каждое следующее
    //число больше предыдущего).
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int size = scanner.nextInt();
            double[] array = new double[size];
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            boolean isSorting = true; //переменная которая будет указывать является ли массив возрастающей последовательности
            for (int i = 0; i < size; i++) {
                if (array[i] <= array[size - 1]) {
                    isSorting = false;
                    break;
                }
            }
            if (isSorting) {
                System.out.println("Массив является возрастающей последовательности");
            } else {
                System.out.println("Массив не является возрастающей последовательности");
            }
            System.out.println("Массив:" + " " + Arrays.toString(array));

        } else {
            System.out.println("Вы ввели не число!");
        }
        System.out.println("Конец программы!");
    }
}
