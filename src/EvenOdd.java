import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число: ");
        int x = scanner.nextInt();
        if (x % 2 == 0){
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}
