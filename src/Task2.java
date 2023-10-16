import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    //Найти минимальный-максимальный элементы и вывести в консоль.
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                System.out.print("Элементы" + " " + "[" + i + "]" + ":" + " ");
                array[i] = scanner.nextInt();
            }
            System.out.print("Ваш массив:" + " ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            /**
             * Я решил попробовать пузырьковую сортировку
             */
            boolean isSorted = false;
            int buf; // переменная для обмена
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < size - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        isSorted = false;
                        buf = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = buf;
                    }
                }
            }
            System.out.println("Отсортированный массив:" + " " + Arrays.toString(array));
            System.out.println("Максимальный элемент массива:" + " " + array[size - 1]);
            System.out.println("Минимальный элемент массива:" + " " + array[0]);
        } else {
            System.out.println("Вы ввели не элемент массива");
        }
        System.out.println("Конец программы!");
    }
}
