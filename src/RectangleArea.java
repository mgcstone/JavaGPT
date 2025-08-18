import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сторона a: ");
        int a = scanner.nextInt();
        System.out.println("Сторона b: ");
        int b = scanner.nextInt();
        int area = a*b;
        System.out.println("Площадь прямоугольника равна: " + area);
    }
}
