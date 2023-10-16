import java.util.Scanner;
//Пройти по массиву, вывести все элементы в прямом и в обратном порядке
public class Task1 {
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
            System.out.print("Ваш массив в прямом порядке:" + " ");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.print("Ваш массив в обратном порядке:" + " ");
            for (int i = size - 1; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
        } else {
            System.out.println("Вы ввели не число!");
        }
        System.out.println();
        System.out.println("Конец программы!");
    }
}
