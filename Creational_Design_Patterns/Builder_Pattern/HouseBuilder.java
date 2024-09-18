package Creational_Design_Patterns.Builder_Pattern.House_Construction;

// Builder Interface

public interface HouseBuilder {
    void reset();
    void buildFoundation();
    void buildWalls();
    void buildRoof();
    House getResult();
}
