import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}
