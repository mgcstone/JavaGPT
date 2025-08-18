import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите размер массива: ");
        int x = scanner.nextInt();
        int[] array = new int[x];

        int sumEven = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введи " + (i + 1) + " число: ");
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
               sumEven =+ array[i];
            }

        }
        System.out.println("Прямой массив: " + Arrays.toString(array));
        System.out.println("Сумма четных числе равна: " + sumEven);
        System.out.print("Масси в в обратном порядке: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
