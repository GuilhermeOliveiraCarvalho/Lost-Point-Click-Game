package Musics;

import Main.GameManager;

import java.net.URL;

public class Effects {

    GameManager gm;
    public Effects(GameManager gm) {
        this.gm = gm;
    }
    public URL deathSound = getClass().getClassLoader().getResource("sound//death.wav");
    public URL hitSound = getClass().getClassLoader().getResource("sound//hit.wav");
    public URL hitEffect01 = getClass().getClassLoader().getResource("sound//hit01.wav");
    public URL healSound = getClass().getClassLoader().getResource("sound//heal.wav");
    public URL itemSound = getClass().getClassLoader().getResource("sound//item.wav");
    public URL cough01 = getClass().getClassLoader().getResource("sound//cough01.wav");
}
