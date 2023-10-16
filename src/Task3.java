import java.util.Scanner;

public class Task3 {
    //Найти индексы минимального и максимального элементов и вывести в консоль.
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int size = scanner.nextInt();
            double[] array = new double[size];
            int minIndex = 0;
            int maxIndex = 0;
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * 100);
            }
            System.out.print("Массив:" + " ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }

            for (int i = 0; i < size; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }

            }
            System.out.println();
            System.out.println("Индекс минимального элемента:" + " " + minIndex);
            System.out.println("Индекс максимального элемента:" + " " + maxIndex);
        } else {
            System.out.println("Вы ввели не число!");
        }
        System.out.println("Конец программы!");
        ;
    }
}
