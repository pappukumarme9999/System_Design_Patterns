package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class VictorianTable implements Table {
    @Override
    public void create() {
        System.out.println("Victorian Table Created");
    }
}
