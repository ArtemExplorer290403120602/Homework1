import java.util.Scanner;

public class Task4 {
    //Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
    //сообщение, что их нет.
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
            int count = 0;
            for (int i = 0; i < size; i++) {
                if (array[i] == 0) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("Количество нулевых значений:" + " " + count);
            } else {
                System.out.println("В массиве отсутствуют нулевые элементы");
            }
        } else {
            System.out.println("Вы ввели не число!");
        }
        System.out.println("Конец программы!");
    }
}
