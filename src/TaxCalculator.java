import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи сумму покупи: ");
        double sum = scanner.nextDouble();
        if (sum > 1000) {
            sum = sum * 0.9;
            System.out.println("Скидка применена");
        } else {
            System.out.println("Скидка не предусмотрена.");
        }
        System.out.println("Итоговая сумма:" + sum);
    }
}
