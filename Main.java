package Builder;

import Builder.model.CarBuilder;
import Builder.model.CarSchemaBuilder;

public class Main
{
    public static void main(String[] args)
    {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        builder.model("Chiron");
        System.out.println(builder.build());

        CarSchemaBuilder schemaBuilder = new CarSchemaBuilder();
        director.buildLambo(schemaBuilder);
        schemaBuilder.engine("90").numberOfDoors(3);
        System.out.println(schemaBuilder.build());
    }
}