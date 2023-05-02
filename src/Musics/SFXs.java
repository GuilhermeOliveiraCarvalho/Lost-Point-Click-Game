package Musics;

import Main.GameManager;

import java.net.URL;

public class SFXs {

    GameManager gm;
    public SFXs(GameManager gm) {
        this.gm = gm;

    }
    public URL night01 = getClass().getClassLoader().getResource("SFX//night01.wav");
    public URL weirdSound01 = getClass().getClassLoader().getResource("SFX//weirdSound01.wav");
}
