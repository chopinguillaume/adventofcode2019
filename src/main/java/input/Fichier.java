package input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Objects;

public class Fichier {


    private String nom;
    private BufferedReader reader;
    private File file;


    public Fichier(String nom) {
        this.nom = nom;
    }


    private File fichier() {
        if (file == null) {
            file = new File(Objects.requireNonNull(getClass().getClassLoader().getResource(nom)).getFile());
        }
        return file;
    }


    public BufferedReader reader() throws FileNotFoundException {
        if (reader == null) {
            File fichier = fichier();
            reader = new BufferedReader(new FileReader(fichier));
        }
        return reader;
    }
}
