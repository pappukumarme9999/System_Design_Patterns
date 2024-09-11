package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class VictorianChair implements Chair {
    @Override
    public void create() {
        System.out.println("Victorian Chair Created");
    }
}
