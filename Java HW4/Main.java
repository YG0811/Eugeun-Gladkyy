public class Main {

    public static void main(String[] args) {
        // Приклад використання методу
        int[] array = {1, 2, 3, 4, 5};
        int n = 3;
        int[] result = reverseArrayPartially(array, n);

        if (result != null) {
            System.out.print("Original Array: ");
            printArray(array);
            System.out.print("Reversed Array (partial): ");
            printArray(result);
        } else {
            System.out.println("Invalid value of n. Unable to reverse array partially.");
        }
    }

    public static int[] reverseArrayPartially(int[] array, int n) {
        if (n < 0 || n > array.length) {
            return null;
        }

        int[] reversedArray = array.clone();
        for (int i = 0; i < n / 2; i++) {
            int temp = reversedArray[i];
            reversedArray[i] = reversedArray[n - 1 - i];
            reversedArray[n - 1 - i] = temp;
        }

        return reversedArray;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
