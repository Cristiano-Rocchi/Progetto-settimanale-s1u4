import Entities.RegistrazioneAudio;
import Entities.Video;

public class Main {
    public static void main(String[] args) {
        RegistrazioneAudio registrazioneAudio = new RegistrazioneAudio("Audio1", 1, 15);
        Video video = new Video("video1", 5, 10, 7);
        
        video.play();
    }
}