package day01;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestDay01 {

    @Test
    public void fuel_module_12_egal_2() {
        Module m = new Module(12);
        int fuel = m.fuelNecessaire();
        Assert.assertEquals(2, fuel);
    }

    @Test
    public void fuel_module_14_egal_2() {
        Module m = new Module(14);
        int fuel = m.fuelNecessaire();
        Assert.assertEquals(2, fuel);
    }

    @Test
    public void fuel_module_1969_egal_654() {
        Module m = new Module(1969);
        int fuel = m.fuelNecessaire();
        Assert.assertEquals(654, fuel);
    }

    @Test
    public void fuel_module_100756_egal_33583() {
        Module m = new Module(100756);
        int fuel = m.fuelNecessaire();
        Assert.assertEquals(33583, fuel);
    }

    @Test
    public void somme_fuel_modules_test() throws IOException {
        FuelCounterUpper compteur = new FuelCounterUpper("day01-test.txt");
        int fuelTotal = compteur.fuelModules();
        Assert.assertEquals(2 + 2 + 654 + 33583, fuelTotal);
    }


    @Test
    public void fuel_total_14_egal_2() {
        Module m = new Module(14);
        int fuel = m.fuelTotalNecessaire();
        Assert.assertEquals(2, fuel);
    }

    @Test
    public void fuel_total_1969_egal_966() {
        Module m = new Module(1969);
        int fuel = m.fuelTotalNecessaire();
        Assert.assertEquals(966, fuel);
    }

    @Test
    public void fuel_total_100756_egal_50346() {
        Module m = new Module(100756);
        int fuel = m.fuelTotalNecessaire();
        Assert.assertEquals(50346, fuel);
    }

    @Test
    public void fuel_total_modules_test() throws IOException {
        FuelCounterUpper compteur = new FuelCounterUpper("day01-test.txt");
        int fuelTotal = compteur.fuelTotal();
        Assert.assertEquals(2 + 2 + 966 + 50346, fuelTotal);
    }


}
