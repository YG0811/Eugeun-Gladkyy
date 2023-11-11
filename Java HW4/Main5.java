public class Main5 {

    public static void main(String[] args) {
        int[] array = {5, 4, 2, 11, 9, 10, 4, 7, 3};

        evenBeforeOdd(array);

        System.out.print("Sorted Array: ");
        printArray(array);
    }

    public static void evenBeforeOdd(int[] array) {
        int evenIndex = 0;

        while (evenIndex < array.length && array[evenIndex] % 2 == 0) {
            evenIndex++;
        }

        for (int i = evenIndex + 1; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                int temp = array[i];
                for (int j = i; j > evenIndex; j--) {
                    array[j] = array[j - 1];
                }
                array[evenIndex] = temp;
                evenIndex++;
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
