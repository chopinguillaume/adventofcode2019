package day01;

class Module {
    private int masse;

    Module(int masse) {
        this.masse = masse;
    }

    private static int calculeFuelPourMasse(int masse) {
        return Math.floorDiv(masse, 3) - 2;
    }

    /**
     * Compte le fuel nécessaire, en comptant la masse du module uniquement
     *
     * @return fuel du module
     */
    int fuelNecessaire() {
        return calculeFuelPourMasse(masse);
    }

    /**
     * Compte le fuel total nécessaire, en comptant la masse du module et de son fuel
     *
     * @return fuel total
     */
    int fuelTotalNecessaire() {

        int nouveauFuel = calculeFuelPourMasse(masse);
        int fuelTotal = nouveauFuel;
        while ((nouveauFuel = calculeFuelPourMasse(nouveauFuel)) > 0) {
            fuelTotal += nouveauFuel;
        }

        return fuelTotal;
    }
}
