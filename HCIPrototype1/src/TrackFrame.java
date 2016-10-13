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

	public void setAudioToDisplay(AudioInputStream audioInputStream){
		singleChannelWaveformPanels = new ArrayList();
		audioInfo = new AudioInfo(audioInputStream);
		for (int t=0; t<audioInfo.getNumberOfChannels(); t++){
			SingleWaveformPanel waveformPanel
				= new SingleWaveformPanel(audioInfo, t);
			singleChannelWaveformPanels.add(waveformPanel);
			add(createChannelDisplay(waveformPanel, t));
		}
	}
	private JComponent createChannelDisplay(
			SingleWaveformPanel waveformPanel,
			int index) {

       JPanel panel = new JPanel(new BorderLayout());
	   panel.add(waveformPanel, BorderLayout.CENTER);

	   JLabel label = new JLabel("Channel " + ++index);
	   panel.add(label, BorderLayout.NORTH);

	   return panel; 
	}
}
