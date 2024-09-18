package Creational_Design_Patterns.Builder_Pattern.House_Construction;

// Director

public class HouseDirector {
    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    public void constructSimpleHouse() {
        builder.reset();
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
    }

    public void constructLuxuryHouse() {
        builder.reset();
        builder.buildFoundation();
        builder.buildWalls();
        builder.buildRoof();
    }
}
