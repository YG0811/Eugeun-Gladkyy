public class Main3 {
    public static void main(String[] args) {

        String[] deck = new String[52];
        String[] deckReversed = new String[52];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = String.valueOf(i + 1);
        }

        for (int i = 0; i < deckReversed.length; i++) {
            deckReversed[i] = deck[deck.length - 1 - i];
        }

        System.out.println("deck (зростаючий порядок):");
        for (String card : deck) {
            System.out.print(card + " ");
        }

        System.out.println("\ndeckReversed (зменшуючий порядок):");
        for (String card : deckReversed) {
            System.out.print(card + " ");
        }
    }
}

