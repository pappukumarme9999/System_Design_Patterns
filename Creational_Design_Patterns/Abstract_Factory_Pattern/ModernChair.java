package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class ModernChair implements Chair {
    @Override
    public void create() {
        System.out.println("Modern Chair Created");
    }
}
