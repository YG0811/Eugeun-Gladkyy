import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я: ");
        String name = scanner.nextLine();
        System.out.print("Введіть рік народження: ");
        int year = scanner.nextInt();
        System.out.print("Введіть місяць народження: ");
        int month = scanner.nextInt();
        System.out.print("Введіть день народження: ");
        int day = scanner.nextInt();
        System.out.println("Мене звати " + name + ". Я народився " + day + "." + month + "." + year);
    }
}


















