package Entities;

import Interfaces.Luminosita;
import Interfaces.Show;

public class Immagine extends ElementoMultimediale implements Show, Luminosita {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    @Override
    public void luminosita() {
        System.out.println(getTitolo() + " " + "!".repeat(luminosita));

    }

    @Override
    public void show() {

    }
}
