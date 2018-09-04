package com.designPattern.structural.adapter.ex1;

public class MainAdapter1 {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "heymp3.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","heyVLC.vlc");
        audioPlayer.play("avi","lolo.avi");
    }
}
