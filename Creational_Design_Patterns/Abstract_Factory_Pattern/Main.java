package Creational_Design_Patterns.Abstract_Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();

        modernChair.create();  // Output: Modern Chair Created
        modernTable.create();  // Output: Modern Table Created

        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();

        victorianChair.create();  // Output: Victorian Chair Created
        victorianTable.create();  // Output: Victorian Table Created
    }
}
