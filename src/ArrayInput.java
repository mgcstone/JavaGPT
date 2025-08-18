import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int x = scanner.nextInt();
        int[] array = new int[x];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i+1) + " число для массива");
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }


    }
}
