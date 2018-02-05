package com.learning.designmode.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class AudioPlayerTest {

	@Test
	public void test() {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "fjkdsla");
		audioPlayer.play("mp4", "jfkdsljfakld");
		audioPlayer.play("vlc", "jfdsklfjslkdjlfjskjdfjslkjklfjdsk");
		audioPlayer.play("fdjskfjslkd", "fjdksljafljkds");
		
	}

}
