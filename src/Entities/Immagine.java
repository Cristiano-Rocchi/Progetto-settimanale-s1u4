package Entities;

import Interfaces.Show;

public class Immagine extends ElementoMultimediale implements Show {
    /*ATTRIBUTI*/
    private int luminosita;

    /*COSTRUTTORI*/
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    /*METODI*/
    @Override
    public void show() {
        System.out.println(getTitolo() + " " + "*".repeat(luminosita));
    }
}
