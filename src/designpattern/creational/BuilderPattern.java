package designpattern.creational;

interface HousePlan {

    void setBasement(String basement);
    void setStructure(String structure);
    void setRoof(String roof);
    void setInterior(String interior);
}

class House implements HousePlan {

    private String basement;
    private String structure;
    private String roof;
    private String interior;

    @Override
    public void setBasement(String basement) {
        this.basement = basement;
    }

    @Override
    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public void setRoof(String roof) {
        this.roof = roof;
    }

    @Override
    public void setInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public String toString() {
        return "House{" +
                "basement='" + basement + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", interior='" + interior + '\'' +
                '}';
    }
}

interface HouseBuilder {

    void buildBasement();
    void buildStructure();
    void buildRoof();
    void buildInterior();

    House getHouse();
}

class ApartmentBuilder implements HouseBuilder {

    private House house;

    public ApartmentBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        this.house.setBasement("Apartment Basement");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("Apartment Structure");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Apartment Roof");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("Apartment Interior");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}

class MansionBuilder implements HouseBuilder {

    private House house;

    public MansionBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        this.house.setBasement("Mansion Basement");
    }

    @Override
    public void buildStructure() {
        this.house.setStructure("Mansion Structure");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("Mansion Roof");
    }

    @Override
    public void buildInterior() {
        this.house.setInterior("Mansion Interior");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}

class RealEstateBuilder {

    private HouseBuilder houseBuilder;

    public RealEstateBuilder (HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse() {
        this.constructHouse();
        return this.houseBuilder.getHouse();
    }

    private void constructHouse() {
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }
}

public class BuilderPattern {

    public static void main(String[] args) {
        HouseBuilder mansionBuilder = new MansionBuilder();
        HouseBuilder apartmentBuilder = new ApartmentBuilder();

        RealEstateBuilder realEstateBuilderMansion = new RealEstateBuilder(mansionBuilder);
        RealEstateBuilder realEstateBuilderApartments = new RealEstateBuilder(apartmentBuilder);

        House houseMansion = realEstateBuilderMansion.getHouse();
        System.out.println(houseMansion);

        House houseApartments = realEstateBuilderApartments.getHouse();
        System.out.println(houseApartments);
    }
}
