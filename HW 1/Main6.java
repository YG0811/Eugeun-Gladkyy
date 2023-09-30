import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше ціле число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введіть друге ціле число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введіть третє ціле число: ");
        int num3 = scanner.nextInt();
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.print("Серед чисел є пара рівних: ");
            if (num1 == num2) {
                System.out.print(num1 + " " + num2);
            }
            if (num1 == num3) {
                System.out.print(num1 + " " + num3);
            }
            if (num2 == num3) {
                System.out.print(num2 + " " + num3);
            }
        } else {
            System.out.println("Серед чисел немає пари рівних.");
        }
    }
}
