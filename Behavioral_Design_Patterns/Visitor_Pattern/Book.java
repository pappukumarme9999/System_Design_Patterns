package Visitor_Pattern;

// Concrete Element - Book

public class Book implements Item {
    private int price;
    private String isbn;

    public Book(int price, String isbn) {
        this.price = price;
        this.isbn = isbn;
    }

    public int getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
