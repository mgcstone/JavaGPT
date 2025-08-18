import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как тебя зовут?");
        String name = scanner.next();
        System.out.println("Сколько тебе лет?");
        String age = scanner.next();
        System.out.println("Привет " + name + "! Тебе уже " + age + " - это здорово!");
    }
}
