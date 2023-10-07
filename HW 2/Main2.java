import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double сума = 0.0;

        while (true) {
            System.out.print("Введіть число: ");
            double введене_число = scanner.nextDouble();
            сума += введене_число;
            if (введене_число == -1) {
                break;
            }
        }
        System.out.println("Сума всіх введених чисел: " + сума);
    }
}
