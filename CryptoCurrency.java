// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class CryptoCurrency {
    private String name;
    private double price;
    private static long circulatingSupply;
    public CryptoCurrency(String name, double price, long circ) {
        this.name = name;
        this.price = price;
        circulatingSupply = circ;

    }
    public static double calculateTotalPrice(CryptoCurrency[] gg) {
        double result = 0;
        for(CryptoCurrency curr : gg) {
            result += curr.price * circulatingSupply;
        }
        return result;
    }
}