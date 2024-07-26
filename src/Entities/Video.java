package Entities;

import Interfaces.Luminosita;
import Interfaces.Play;


public class Video extends ElementoMultimediale implements Play, Luminosita {
    private int luminosita;
    private int durata;
    private int volume;

    public Video(String titolo, int luminosita, int durata, int volume) {
        super(titolo);
        this.luminosita = luminosita;
        this.durata = durata;
        this.volume = volume;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume) + "*".repeat(luminosita));
        }


    }

    @Override
    public void luminosita() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "*".repeat(luminosita));
        }

    }


    /*COSTRUTTORI*/








    /*METODI*/
}
