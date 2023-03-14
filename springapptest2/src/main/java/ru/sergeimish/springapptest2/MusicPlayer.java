package ru.sergeimish.springapptest2;
import org.springframework.beans.factory.annotation.Value;

import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    public String getName() {
        return name;
    }
    public int getVolume() {
        return volume;
    }
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    private RapMusic rapMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic, RapMusic rapMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
        this.rapMusic = rapMusic;
    }



    public void playMusic(MusicStyle style){
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        if(style == MusicStyle.CLASSICAL){
            System.out.println(classicalMusic.getSong().get(randomNumber));
        } else if (style == MusicStyle.ROCK){
            System.out.println(rockMusic.getSong().get(randomNumber));
        }
        }
    }
