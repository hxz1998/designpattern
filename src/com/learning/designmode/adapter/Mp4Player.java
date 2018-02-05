package com.learning.designmode.adapter;

public class Mp4Player extends AdvanceMediaPlayer {
	@Override 
	public void playMp4(String type, String filename) {
		System.out.println("播放的是 " + type + "类型的：" + filename + "文件");
	}
}
