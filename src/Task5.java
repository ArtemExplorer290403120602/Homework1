import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    //Пройти по массиву и поменять местами элементы первый и последний, второй и
    //предпоследний и т.д.
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
    // проходим по массиву до его середины
            for (int i = 0; i < size / 2; i++) {
                int buf;
                buf = array[i]; // buf равна первой
                array[i] = array[size - 1 - i];
                array[size - 1 - i] = buf;
            }
            System.out.print("Другой массив:" + " " + Arrays.toString(array));
        }
        System.out.println();
        System.out.println("Конец программы!");
    }
}
