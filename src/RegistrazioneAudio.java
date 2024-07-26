public class RegistrazioneAudio extends ElementoMultimediale {
    /*ATTRIBUTI*/
    private int volume;
    private int durata;




    /*COSTRUTTORI*/

    public RegistrazioneAudio(String titolo, int volume, int durata) {
        super(titolo);
        this.volume = volume;
        this.durata = durata;
    }

    /*METODI*/

    public void play() {

        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume));
        }
    }


    public void abbassaVolume() {
        volume++;

    }

    public void alzaVolume() {
        if (volume > 0) {
            volume--;
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
}
