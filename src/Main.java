import Entities.ElementoMultimediale;
import Entities.Immagine;
import Entities.RegistrazioneAudio;
import Entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ElementoMultimediale[] arrayMultimedia = new ElementoMultimediale[5];
        Scanner scanner = new Scanner(System.in);
        boolean esci = false;

        // Create multimedia elements
        for (int i = 0; i < 5; i++) {
            System.out.println("Premi 1 per creare immagine, 2 per creare audio o 3 per creare video:");
            int scelta = Integer.parseInt(scanner.nextLine());
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci titolo:");
                    String titoloImg = scanner.nextLine();
                    System.out.println("Inserisci luminosità:");
                    int luminosita = Integer.parseInt(scanner.nextLine());
                    arrayMultimedia[i] = new Immagine(titoloImg, luminosita);
                    break;
                case 2:
                    System.out.println("Inserisci titolo:");
                    String titoloAudio = scanner.nextLine();
                    System.out.println("Inserisci volume:");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci durata:");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    arrayMultimedia[i] = new RegistrazioneAudio(titoloAudio, volumeAudio, durataAudio);
                    break;
                case 3:
                    System.out.println("Inserisci titolo:");
                    String titoloVideo = scanner.nextLine();
                    System.out.println("Inserisci luminosità:");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci durata:");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci volume:");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    arrayMultimedia[i] = new Video(titoloVideo, luminositaVideo, durataVideo, volumeVideo);
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    i--;
                    break;
            }
        }


        while (!esci) {
            System.out.println("Inserisci un numero da 1 a 5 per eseguire un oggetto oppure 0 per finire:");
            int sceltaMultimedia = Integer.parseInt(scanner.nextLine());
            if (sceltaMultimedia == 0) {
                esci = true;
            } else if (sceltaMultimedia >= 1 && sceltaMultimedia <= 5) {
                if (arrayMultimedia[sceltaMultimedia - 1] instanceof Video) {
                    ((Video) arrayMultimedia[sceltaMultimedia - 1]).play();
                }
                if (arrayMultimedia[sceltaMultimedia - 1] instanceof Immagine) {
                    ((Immagine) arrayMultimedia[sceltaMultimedia - 1]).show();
                }
                if (arrayMultimedia[sceltaMultimedia - 1] instanceof RegistrazioneAudio) {
                    ((RegistrazioneAudio) arrayMultimedia[sceltaMultimedia - 1]).play();
                }
            } else {
                System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
    }
}
