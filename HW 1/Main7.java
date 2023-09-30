import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введіть третє число: ");
        double num3 = scanner.nextDouble();
        double middleNumber;
        if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
            middleNumber = num1;
        } else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
            middleNumber = num2;
        } else {
            middleNumber = num3;
        }

        System.out.println("Середнє число: " + middleNumber);
    }
}

