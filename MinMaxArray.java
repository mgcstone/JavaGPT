import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер массива: ");
        int x = scanner.nextInt();;
        int[]array = new int[x];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введи " + (i+1) + " значение массива: ");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        int max = array[0];
        for(int num:array) {
            if (num < min) {

                min = num;
            }
            if (num > max) {

                max = num;
            }

        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);

    }
}
