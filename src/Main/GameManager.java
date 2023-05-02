package Main;

import Event.Event01;
import Musics.Effects;
import Musics.SE;
import Musics.SFXs;
import Musics.Tracks;
import Voices.Voices01;

import java.net.URL;

public class GameManager {
    ActionHandler aHandler = new ActionHandler(this);
    public UI ui = new UI(this);
    public Player player = new Player(this);
    public Popup popup = new Popup(this);
    public Button buttonB = new Button(this);
    public SceneChanger sChanger = new SceneChanger(this);
    Music music = new Music();
    SE se = new SE ();
    public Event01 ev1 = new Event01(this);
    public Tracks track = new Tracks(this);
    public SFXs sfXs = new SFXs(this);
    public Voices01 voices01 = new Voices01(this);
    public Effects effects = new Effects((this));
    public GenerateScreen generateScreen = new GenerateScreen(this);


    public static void main(String[] args) {
        new GameManager();
    }
    public GameManager(){

        track.currentMusic = track.introMusic;
        playMusic(track.currentMusic);
        player.setPlayerDefaultStatus();
        sChanger.titleScreen();
    }
    public void playSE(URL url){
        se.setFile(url);
        se.play(url);
    }
    public void playMusic(URL url){
        music.setFile(url);
        music.play(url);
        music.loop(url);
    }
    public void stopMusic(URL url){
        music.stop(url);
    }
}
