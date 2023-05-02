package Musics;

import Main.GameManager;

import java.net.URL;

public class Tracks {

    GameManager gm;
    public Tracks(GameManager gm) {
        this.gm = gm;


    }

    public URL titleMusic = getClass().getClassLoader().getResource("Tracks//Lost.wav");
    public URL introMusic = getClass().getClassLoader().getResource("Tracks//act1fase1.wav");

    public URL currentMusic;
}
