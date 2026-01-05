//Code based from: https://github.com/geekific-official

package Builder;

public interface Builder
{
    Builder id(int id);
    Builder brand(String brand);
    Builder model(String model);
    Builder color(String color);
    Builder height(int height);
    Builder engine(String engine);
    Builder numberOfDoors(int numberOfDoors);
}