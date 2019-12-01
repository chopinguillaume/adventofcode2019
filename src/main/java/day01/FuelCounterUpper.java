package day01;

import input.Fichier;

import java.io.BufferedReader;
import java.io.IOException;

class FuelCounterUpper {
    private String nomFichier;

    FuelCounterUpper(String nomFichier) {

        this.nomFichier = nomFichier;
    }

    int fuelModules() throws IOException {

        try (BufferedReader reader = new Fichier(nomFichier).reader()) {

            return reader.lines()
                    .map(ligne -> new Module(Integer.valueOf(ligne)))
                    .mapToInt(Module::fuelNecessaire)
                    .sum();

        }
    }

    int fuelTotal() throws IOException {

        try (BufferedReader reader = new Fichier(nomFichier).reader()) {

            return reader.lines()
                    .map(ligne -> new Module(Integer.parseInt(ligne)))
                    .mapToInt(Module::fuelTotalNecessaire)
                    .sum();

        }
    }
}
