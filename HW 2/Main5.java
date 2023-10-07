import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім'я: ");
        String ім_я = scanner.nextLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(ім_я + " любить мене!");
        }
    }
}
