package ru.sergeimish.springapptest2;

import org.springframework.stereotype.Component;

@Component("musicBean1")
public class RockMusic {
    public void getSong(){
        System.out.println("Kollisium");
    }

}
