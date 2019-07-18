import javax.sound.sampled.AudioInputStream;
        import javax.sound.sampled.AudioSystem;
        import javax.sound.sampled.SourceDataLine;
        import javax.sound.sampled.UnsupportedAudioFileException;
        import java.io.File;
        import java.io.IOException;
        import javax.sound.sampled.*;

public class bgm {
    public void bgm() {
        File file = new File("C:\\Users\\SouL Kim\\Desktop\\cartoon092.mp3");
        AudioInputStream audioInputStream = null;
        SourceDataLine auline = null;
        try {
            audioInputStream = AudioSystem.getAudioInputStream(file);
        } catch (UnsupportedAudioFileException e1) {
            e1.printStackTrace();
            return;
        } catch (IOException e1) {
            e1.printStackTrace();
            return;
        }
        AudioFormat format = audioInputStream.getFormat();
        DataLine.Info info = new DataLine.Info(SourceDataLine.class,format);
        try{
            auline = (SourceDataLine) AudioSystem.getLine(info);
            auline.open(format);
        } catch (LineUnavailableException e){
            e.printStackTrace();

            return;
        } catch (Exception e){
            e.printStackTrace();
            return;
        }
        auline.start();
    }
}