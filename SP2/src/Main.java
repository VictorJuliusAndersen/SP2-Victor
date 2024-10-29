import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Jørn Jønke Nielsen");

        PrintedBook printedBook1 = new PrintedBook("Mit liv", "FAG", 200, 300);
        PrintedBook printedBook2 = new PrintedBook("Mit andet liv", "FAG", 100, 500);
        AudioBook audioBook = new AudioBook("En ny begyndelse", "FAG", 100, 480);

        author.addTitle(printedBook1);
        author.addTitle(printedBook2);
        author.addTitle(audioBook);

        DecimalFormat df = new DecimalFormat("#.00"); // Format til 2 decimaler

        System.out.println("Points 1: " + printedBook1.calculatePoints());
        System.out.println("Points 2: " + printedBook2.calculatePoints());
        System.out.println("Points 3: " + audioBook.calculatePoints());

        System.out.println("Result 1: " + df.format(printedBook1.calculateRoyalty()) + " kr");
        System.out.println("Result 2: " + df.format(printedBook2.calculateRoyalty()) + " kr");
        System.out.println("Result 3: " + df.format(audioBook.calculateRoyalty()) + " kr");

        System.out.println(author.getName() + ": " + df.format(author.calculateTotalPay()) + " kr");
    }
}

