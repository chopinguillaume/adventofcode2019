package day01;

import org.apache.log4j.Logger;

import java.io.IOException;

public class Day01Runner {

    public static void main(String[] args) throws IOException {

        FuelCounterUpper fcu = new FuelCounterUpper("day01-input.txt");

        Logger.getLogger("Day01").info("Fuel des modules = " + fcu.fuelModules());
        Logger.getLogger("Day01").info("Fuel total = " + fcu.fuelTotal());

    }
}
