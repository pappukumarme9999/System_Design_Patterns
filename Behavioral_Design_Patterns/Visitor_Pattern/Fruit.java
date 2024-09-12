package Visitor_Pattern;

// Concrete Element - Fruit

public class Fruit implements Item {
    private int pricePerKg;
    private String name;

    public Fruit(int pricePerKg, String name) {
        this.pricePerKg = pricePerKg;
        this.name = name;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
