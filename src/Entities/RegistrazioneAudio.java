package Entities;

import Interfaces.Play;
import Interfaces.Volume;

import java.util.Scanner;

public class RegistrazioneAudio extends ElementoMultimediale implements Play, Volume {
    Scanner scanner = new Scanner(System.in);
    /*ATTRIBUTI*/
    private int volume;


    /*COSTRUTTORI*/
    private int durata;

    /*METODI*/

    public RegistrazioneAudio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    public void abbassaVolume() {
        System.out.println("Di quanto vuoi abbassare il volume?");
        int valoreVolume = Integer.parseInt(scanner.nextLine());
        if (valoreVolume > 0 && valoreVolume < this.volume) {
            setVolume(valoreVolume);
        } else {
            System.out.println("il volume deve essere mnore");
            valoreVolume = Integer.parseInt(scanner.nextLine());
        }


    }

    public void alzaVolume() {
        System.out.println("Di quanto vuoi alzare il volume?");
        int valoreVolume = Integer.parseInt(scanner.nextLine());
        if (valoreVolume > this.volume) {
            setVolume(valoreVolume);
        } else {
            System.out.println("il volume deve essere maggiore");
            valoreVolume = Integer.parseInt(scanner.nextLine());
        }


    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    /*METODI*/
    @Override
    public void play() {
        {

            for (int i = 0; i < durata; i++) {
                System.out.println(getTitolo() + " " + "!".repeat(volume));
            }
        }
    }


}

