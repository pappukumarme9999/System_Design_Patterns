package Creational_Design_Patterns.Builder_Pattern.House_Construction;

// Client 

public class Main {
    public static void main(String[] args) {
        // Create a Simple House
        HouseBuilder simpleBuilder = new SimpleHouseBuilder();
        HouseDirector director = new HouseDirector(simpleBuilder);
        director.constructSimpleHouse();
        House simpleHouse = simpleBuilder.getResult();
        System.out.println(simpleHouse);

        // Create a Luxury House
        HouseBuilder luxuryBuilder = new LuxuryHouseBuilder();
        director.changeBuilder(luxuryBuilder);
        director.constructLuxuryHouse();
        House luxuryHouse = luxuryBuilder.getResult();
        System.out.println(luxuryHouse);
    }
}
