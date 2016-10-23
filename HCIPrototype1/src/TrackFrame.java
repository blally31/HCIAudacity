/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import java.util.*;
import javax.sound.sampled.AudioInputStream;
import java.awt.GridLayout;
import java.awt.BorderLayout;
/**
 *
 * @author Brendan
 */
public class TrackFrame extends JPanel {
    private ArrayList singleChannelWaveformPanels = new ArrayList();
    private AudioInfo audioInfo = null;
   
    public TrackFrame() {
        setLayout(new GridLayout(0,1));
    }

    public void setAudioToDisplay(AudioInputStream audioInputStream) {
        //Initiate the class fields
        singleChannelWaveformPanels = new ArrayList();
        audioInfo = new AudioInfo(audioInputStream);
        //Creating a channel display for each channel
        for (int t = 0; t < audioInfo.getNumberOfChannels(); t++){
                SingleWaveFormPanel waveformPanel
                        = new SingleWaveFormPanel(audioInfo, t);
                singleChannelWaveformPanels.add(waveformPanel);
                javax.swing.JComponent p = createChannelDisplay(waveformPanel);
                p.setSize(new java.awt.Dimension(2000, 100));
                add(p);
        }
    }
    //Creates each display for a channel
    private JComponent createChannelDisplay(SingleWaveFormPanel waveformPanel) {

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(waveformPanel, BorderLayout.CENTER);

        JLabel label = new JLabel(" ");
        panel.add(label, BorderLayout.NORTH);

        return panel; 
    }
}
