package Builder;

public class Car
{
    private final int id;
    private final int height;
    private final String brand;
    private final String model;
    private final String color;
    private final String engine;
    private final int numberOfDoors;

    Car(int id, String brand, String model, String color, int height, String engine, int numberOfDoors)
    {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.height = height;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString()
    {
        return 
        """
        Car
        {
            id=%s,
            height=%s,
            brand=%s,
            model=%s,
            color=%s,
            engine=%s,
            numberOfDoors=%s
        }""".formatted(id, height, brand, model, color, engine, numberOfDoors);
    }
}