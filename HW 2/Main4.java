public class Main4 {
    public static void main(String[] args) {
        int висота = 9;

        for (int рядок = 1; рядок <= висота; рядок++) {

            for (int пробіли = 1; пробіли <= висота - рядок; пробіли++) {
                System.out.print(" ");
            }

            for (int знаки = 1; знаки <= 2 * рядок - 1; знаки++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
