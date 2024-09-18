package Creational_Design_Patterns.Builder_Pattern.House_Construction;

// Concrete Builder 1

public class SimpleHouseBuilder implements HouseBuilder {
    private House house;

    @Override
    public void reset() {
        house = new House();
    }

    @Override
    public void buildFoundation() {
        house.add("Simple Foundation");
    }

    @Override
    public void buildWalls() {
        house.add("Simple Walls");
    }

    @Override
    public void buildRoof() {
        house.add("Simple Roof");
    }

    @Override
    public House getResult() {
        return house;
    }

    // other methods 
}
