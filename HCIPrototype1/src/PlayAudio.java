import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.sound.sampled.*;

public class PlayAudio {

    AudioFormat audioFormat;
    AudioInputStream audioStream;
    SourceDataLine sourceLine;
    boolean stopPlayback;
    boolean loaded;
    
    public PlayAudio() {
        stopPlayback = false;
        loaded = false;
    }
    public void setLoaded(boolean op) {
        loaded = op;
    }
    
    public boolean isLoaded() {
        if (loaded == true) {
            return true;
        }
        return false;
    }
    
    public void setFormat(AudioFormat format) {
        audioFormat = format;
    }
    
    public void setAudioStream(AudioInputStream stream) {
        audioStream = stream;
    }
    
    public AudioInputStream getAudioStream() {
        return audioStream;
    }
    
    public void setPlayback(boolean op) {
        stopPlayback = op;
    }
    
    public void playAudio() {
        try {
            audioFormat = audioStream.getFormat();
            DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, audioFormat);
            sourceLine = (SourceDataLine)AudioSystem.getLine(dataLineInfo);
            
            new PlayThread().start();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
    
    //=============================================//
//Inner class to play back the data from the
// audio file.
class PlayThread extends Thread{
    byte tempBuffer[] = new byte[10000];

    public void run(){
        try{
            sourceLine.open(audioFormat);
            sourceLine.start();

            int cnt;
            //Keep looping until the input read method
            // returns -1 for empty stream or the
            // user clicks the Stop button causing
            // stopPlayback to switch from false to
            // true.
            while((cnt = audioStream.read(
                 tempBuffer,0,tempBuffer.length)) != -1 && stopPlayback == false){
                if(cnt > 0){
                //Write data to the internal buffer of
                // the data line where it will be
                // delivered to the speaker.
                sourceLine.write(tempBuffer, 0, cnt);
                }//end if
            }//end while
            //Block and wait for internal buffer of the
            // data line to empty.
            sourceLine.drain();
            sourceLine.close();

        }
        catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
}
