//Code based from: https://github.com/geekific-official

package Builder;

public class CarBuilder implements Builder
{
    private int id;
    private int height;
    private String brand;
    private String model;
    private String color;
    private String engine;
    private int numberOfDoors;

    @Override
    public CarBuilder id(int id)
    {
        this.id = id;
        return this;
    }

    @Override
    public CarBuilder brand(String brand)
    {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder model(String model)
    {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder color(String color)
    {
        this.color = color;
        return this;
    }

    @Override
    public CarBuilder height(int height)
    {
        this.height = height;
        return this;
    }

    @Override
    public CarBuilder engine(String engine)
    {
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder numberOfDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public Car build()
    {
        return new Car(id, brand, model, color, height, engine, numberOfDoors);
    }
}