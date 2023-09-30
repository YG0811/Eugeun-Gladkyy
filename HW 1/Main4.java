import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше ім'я: ");
        String str1 = scanner.nextLine();
        System.out.print("Введіть друге ім'я: ");
        String str2 = scanner.nextLine();
        if (str1.equals(str2)) {
            System.out.println("Імена ідентичні: " + str1);
        } else if (str1.length() == str2.length()) {
            System.out.println("Імена різні за складом, але однакові за довжиною.");
        }
    }
}
