package Creational_Design_Patterns.Builder_Pattern.House_Construction;

// Concrete Builder 2

public class LuxuryHouseBuilder implements HouseBuilder {
    private House house;

    @Override
    public void reset() {
        house = new House();
    }

    @Override
    public void buildFoundation() {
        house.add("Luxury Foundation");
    }

    @Override
    public void buildWalls() {
        house.add("Luxury Walls with Insulation");
    }

    @Override
    public void buildRoof() {
        house.add("Luxury Roof with Solar Panels");
    }

    @Override
    public House getResult() {
        return house;
    }

    // other methods 
}
