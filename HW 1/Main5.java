import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть довжину сторони a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть довжину сторони b: ");
        double b = scanner.nextDouble();
        System.out.print("Введіть довжину сторони c: ");
        double c = scanner.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Трикутник існує");
        } else {
            System.out.println("Такого трикутника не існує");
        }
    }
}