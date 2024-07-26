package Entities;

import Interfaces.Luminosita;
import Interfaces.Play;


public class Video extends ElementoMultimediale implements Play, Luminosita {
    private int luminosita;
    private int durata;
    private int volume;

    public Video(String titolo, int luminosita, int durata, int volume) {
        super(titolo);
    }

    @Override
    public void play() {
        /*String volume = "";

        for (int i = 0; i < this.volume; i++) {
            volume += "!";
        }
        for (int i = 0; i < this.durata; i++) {
            System.out.println(getTitolo() + volume);

        }*/
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume));
        }

        System.out.println("ciao");
    }

    @Override
    public void luminosita() {

    }


    /*COSTRUTTORI*/








    /*METODI*/
}
