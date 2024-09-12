package Visitor_Pattern;

// Concrete Visitor

public class PriceVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Book ISBN: " + book.getIsbn() + " costs " + book.getPrice());
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.println(fruit.getName() + " costs " + fruit.getPricePerKg() + " per kg");
    }
}
