package Voices;

import Main.GameManager;

import java.net.URL;

public class Voices01 {

    GameManager gm;
    public Voices01(GameManager gm) {
        this.gm = gm;
    }

    public URL raven = getClass().getClassLoader().getResource("voices//Raven.wav");
}
