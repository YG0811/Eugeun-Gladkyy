public class Main1 {

    public static void main(String[] args) {
        int[] numbers = {74, 85, 85, 85, 101, 85, 56};
        int k = 85;

        int lastIndex = lastIndexOf(numbers, k);
        System.out.println("Last Index of " + k + ": " + lastIndex);
    }

    public static int lastIndexOf(int[] numbers, int k) {
        int lastIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {
                lastIndex = i;
            }
        }

        return lastIndex;
    }
}
