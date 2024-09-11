package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class ModernTable implements Table {
    @Override
    public void create() {
        System.out.println("Modern Table Created");
    }
}

