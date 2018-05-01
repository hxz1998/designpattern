package com.learning.designmode.adapter;

public class MediaAdapter implements MediaPlayer {

	private AdvanceMediaPlayer advanceMediaPlayer;
	
	MediaAdapter(String type) {
		if(type.equalsIgnoreCase("mp3")){
			advanceMediaPlayer = new Mp3Player();
		} else if (type.equalsIgnoreCase("mp4")) {
			advanceMediaPlayer = new Mp4Player();
		}
	}
	
	@Override
	public void play(String type, String filename) {
		if(type.equalsIgnoreCase("mp3")){
			advanceMediaPlayer.playMp3(type, filename);
		} else if(type.equalsIgnoreCase("mp4")){
			advanceMediaPlayer.playMp4(type, filename);
		}
	}
	
	
}
