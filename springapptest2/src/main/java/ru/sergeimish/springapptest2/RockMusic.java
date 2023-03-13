package ru.sergeimish.springapptest2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {
    private List<String>rockSongs = new ArrayList<>();
    {
        rockSongs.add("Song of Silents");
        rockSongs.add("Invaders must die");
        rockSongs.add("Mutter");
    }


    public String getSong() {
        return "Kollizium";
    }
}
