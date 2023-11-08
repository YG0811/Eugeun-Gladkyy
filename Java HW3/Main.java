import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість днів: ");
        int numberOfDays = scanner.nextInt();
        double[] temperatures = new double[numberOfDays];

        for(int i = 0; i < numberOfDays; ++i) {
            System.out.print("Введіть температуру для дня " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        scanner.close();
        double sum = 0.0;
        double[] var6 = temperatures;
        int var7 = temperatures.length;

        int aboveAverageCount;
        for(aboveAverageCount = 0; aboveAverageCount < var7; ++aboveAverageCount) {
            double temp = var6[aboveAverageCount];
            sum += temp;
        }

        double averageTemperature = sum / (double)numberOfDays;
        aboveAverageCount = 0;
        double[] var16 = temperatures;
        int var10 = temperatures.length;

        int i;
        for(i = 0; i < var10; ++i) {
            double temp = var16[i];
            if (temp > averageTemperature) {
                ++aboveAverageCount;
            }
        }

        Arrays.sort(temperatures);
        System.out.println("Середня температура за всі дні: " + averageTemperature);
        System.out.println("Кількість днів, коли температура була вищою за середню: " + aboveAverageCount);
        if (numberOfDays >= 2) {
            System.out.println("Два найхолодші дні: " + temperatures[0] + "°C і " + temperatures[1] + "°C");
            System.out.println("Два найгарячіші дні: " + temperatures[numberOfDays - 1] + "°C і " + temperatures[numberOfDays - 2] + "°C");

            }
        }

    }
