package Entities;

public class ElementoMultimediale {
    /*ATTRIBUTI*/
    private String titolo;


    /*COSTRUTTORI*/
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public ElementoMultimediale(int titolo, int volume, int durata, int luminosita) {
    }
    /*METODI*/

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
}
