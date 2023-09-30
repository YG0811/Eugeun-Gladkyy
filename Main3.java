import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int int1 = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int int2 = scanner.nextInt();
        System.out.print("Введіть третє число: ");
        int int3 = scanner.nextInt();
        int max = Math.max(Math.max(int1, int2 ), int3);
        int min = Math.min(Math.min(int1, int2 ), int3);
        int middleNumber = int1 + int2  + int3 - max - min;
        System.out.println("Числа у порядку зменшення: " + max + ", " + middleNumber + ", " + min);
    }
}
