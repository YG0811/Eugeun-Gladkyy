public class Main3 {

    public static void main(String[] args) {
        double[] list1 = {16.1, 12.3, 22.2, 14.4};
        double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};

        System.out.println("Is list1 sorted? " + isSorted(list1));
        System.out.println("Is list2 sorted? " + isSorted(list2));
    }

    public static boolean isSorted(double[] array) {
        if (array.length < 2) {
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}

