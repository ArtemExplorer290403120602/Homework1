import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    //Имеется массив из неотрицательных чисел(любой). Представьте что массив
    //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
    //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
    //содержит нуля в начале, кроме самого числа 0.
    //Пример:
    //Input: [1,4,0,5,6,3]
    //Output: [1,4,0,5,6,4]
    //Input: [9,9,9]
    //Output: [1,0,0,0]
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int size = scanner.nextInt();
            int[] array = new int[size];
            int buf = 1;//начальное значение переноса равно еденице
            for (int i = 0; i < size; i++) {
                System.out.print("Элементы" + " " + "[" + i + "]" + ":" + " ");
                array[i] = scanner.nextInt();
            }
            for (int i = size - 1; i >= 0; i--) {
                int sum = array[i] + buf;//добавляем перенос к текущему элементу массива
                array[i] = sum % 10; // Обновляем текущий элемент массива с учётом остатка от деления на 10
                buf = sum / 10;  // Обновляем значение переноса для следующей итерации

                if (buf == 0) {
                    break;
                }
            }

            /**
             * Если после цикла значение переноса все ещё не равно нулю,значит у нас получилось число с большим
             * количеством разрядов, чем в исходном массиве создаем новый размер массива и копируем старенький
             * но с учетом значения переноса
             */
            if (buf > 0) {
                array = Arrays.copyOf(array, size + 1);
                array[0] = buf;

            }
            for (int nextArray : array) {
                System.out.println(nextArray + " ");
            }

        } else {
            System.out.println("Вы ввели не число!");
        }
    }
}
