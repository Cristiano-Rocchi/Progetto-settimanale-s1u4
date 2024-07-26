package Entities;

import Interfaces.Show;

public class Immagine extends ElementoMultimediale implements Show {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }


    @Override
    public void show() {
        System.out.println(getTitolo() + " " + "*".repeat(luminosita));
    }
}
