package Visitor_Pattern;

public class Client {
    public static void main(String[] args) {
        Item[] items = new Item[]{new Book(100, "1234"), new Fruit(50, "Apple")};
        Visitor priceVisitor = new PriceVisitor();

        for (Item item : items) {
            item.accept(priceVisitor);
        }
    }
}
