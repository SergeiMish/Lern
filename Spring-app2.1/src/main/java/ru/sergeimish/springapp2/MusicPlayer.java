package ru.sergeimish.springapp2;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Сейчас играет " + music.getSong());
    }
}
