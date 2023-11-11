import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {

        int[] numbers = {74, 85, 85, 85, 101, 85, 56};
        int k = 85;

        int[] indexes = allIndexesOf(numbers, k);
        if (indexes != null) {
            System.out.println("Indexes of " + k + ": " + arrayToString(indexes));
        } else {
            System.out.println(k + " not found in the array.");
        }
    }

    public static int[] allIndexesOf(int[] numbers, int k) {
        ArrayList<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {
                indexList.add(i);
            }
        }

        if (!indexList.isEmpty()) {
            int[] indexes = new int[indexList.size()];
            for (int i = 0; i < indexList.size(); i++) {
                indexes[i] = indexList.get(i);
            }
            return indexes;
        } else {
            return null;
        }
    }

    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}

