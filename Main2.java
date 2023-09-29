import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        int d= scanner.nextInt();
        if (a < b && a < c && a < d ) System.out.println(a);
        if (b < a && b < c && b < d ) System.out.println(b);
        if (c < b && c < a && c < d ) System.out.println(c);
        if (d < a && d < b && d < c ) System.out.println(d);

    }
}
