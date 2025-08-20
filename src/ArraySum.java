import java.util.Scanner;
//Найти сумму всех элементов массива
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи длину массива: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введи " + (i + 1) + " элемент массива:");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Сумма эллементов массива равна " + calculateSum(arr));
        scanner.close();
    }

    static int calculateSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
}
