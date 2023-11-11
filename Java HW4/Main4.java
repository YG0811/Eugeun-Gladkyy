public class Main4 {

    public static void main(String[] args) {
        int[] array = {27, 15, 15, 11, 27,27,15,2,31,31,31,31};

        int result = mode(array);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("<0,>101");
        }
    }

    public static int mode(int[] array) {
        if (array.length == 0) {
            return -1;
        }

        int[] frequencies = new int[101];

        for (int num : array) {
            frequencies[num]++;
        }

        int mode = 0;
        int maxFrequency = frequencies[0];

        for (int i = 1; i < frequencies.length; i++) {
            if (frequencies[i] > maxFrequency) {
                mode = i;
                maxFrequency = frequencies[i];
            }
        }

        return mode;
    }
}
