package day21;

import java.util.Scanner;
//поиск максимального и минимального элемента массива
public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длину массива ");
        int len = scanner.nextInt();
        findMinMax(newArray(len,scanner));
        scanner.close();
    }
    // Метод для ввода массива
    static int[] newArray(int len, Scanner scanner) {
        int[]arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введи " + (i + 1) + " элемент массива");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    // Метод для поиска min и max
    static void findMinMax(int[]arr) {
        int min = arr[0];
        int max = arr[0];
        for (int value: arr) {
            if (value > max) max = value;
            if (value < min) min = value;
        }
        System.out.printf("Минимальное число : %d Максимальное число: %d", min, max);
    }
}
