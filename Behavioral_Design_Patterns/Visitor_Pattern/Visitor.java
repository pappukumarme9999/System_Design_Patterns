package Visitor_Pattern;

// Visitor Interface

public interface Visitor {
    void visit(Book book);
    void visit(Fruit fruit);
}
