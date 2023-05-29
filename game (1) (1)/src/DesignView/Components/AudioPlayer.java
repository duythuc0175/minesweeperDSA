package DesignView.Components;

import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class AudioPlayer {

	public enum DefinedAudios{
		CLICK_Sound, FAST_Sound, BEACH_Sound, SINGLETICK_Sound, EXPLODE_Sound, BULB_Sound
	}


	public static void playAudioByResourceName(DefinedAudios audio) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
		URL audioUrl;
		switch(audio){
		
			case CLICK_Sound:

				break;
				
			case FAST_Sound:

				break;
				


		}

		Clip clip = AudioSystem.getClip();

		clip.start();
	}
}
