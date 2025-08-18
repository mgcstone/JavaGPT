import java.util.Scanner;

public class SumNubDivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер массива: ");
        int x = scanner.nextInt();
        int[] array = new int[x];
        int sumDivByThree=0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введи " + (i+1) + " число массива: ");
            array[i] = scanner.nextInt();

        }
        for (int num:array) {
            if (num%3==0){
                sumDivByThree=sumDivByThree+num;
            }
        }
        System.out.println("Сумма чисел делящихся на 3: " + sumDivByThree);
    }
}
